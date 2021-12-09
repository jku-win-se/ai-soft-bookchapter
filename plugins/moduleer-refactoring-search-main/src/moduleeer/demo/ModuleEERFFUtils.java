package moduleeer.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import moduleeer.EntityType;
import moduleeer.LinkToEntity;
import moduleeer.MEERModel;
import moduleeer.ModularizableElement;
import moduleeer.Module;
import moduleeer.ModuleeerPackage;
import moduleeer.RelationshipType;
import moduleeer.procedure.Procedure;

public class ModuleEERFFUtils {

	public static Cohesive calculateCohesive(final MEERModel model) {
		Cohesive cohesive = new Cohesive();
		Iterator<EObject> allMEERModels = model.eAllContents();
		while (allMEERModels.hasNext()) {
			EObject eObject = (EObject) allMEERModels.next();
			if (eObject instanceof ModularizableElement)
				cohesive((ModularizableElement) eObject, model, cohesive);
		}		
		return cohesive;
	}
	
	public static double calculateCohesion(final MEERModel model) {
		return calculateCohesive(model).getCohesion();
	}

	public static double calculateCoupling(final MEERModel model) {
		return calculateCohesive(model).getCohesion();
	}
	
	public static double calculateNrOfModules(final MEERModel model) {
		return model.getModules().size();
	}
	
	public static double calculateAverageNrModElements(final MEERModel model) {
		Iterator<EObject> allMEERModels = model.eAllContents();
		int numberOfElements = 0;
		while (allMEERModels.hasNext()) {
			EObject eObject = (EObject) allMEERModels.next();
			if (eObject instanceof ModularizableElement)
				numberOfElements++;
		}
		return numberOfElements/model.getModules().size();
	}
	
	public static double calculateStdDevModules(final MEERModel model) {
		double[] elementsPerModule = new double[model.getModules().size()];
		for (int i = 0; i < elementsPerModule.length; i++) {
			Module module = model.getModules().get(i); 
			elementsPerModule[i] = module.getModularizableElements().size();
		}			
		StandardDeviation stats = new StandardDeviation(false);	
	    return stats.evaluate(elementsPerModule);
	}
	
	private ModuleEERFFUtils() {
	     ModuleeerPackage.eINSTANCE.eClass();
	}	
	
	//CohesionFF
	private static void cohesive(ModularizableElement element, MEERModel model, Cohesive cohesive) {
		//Generalizes
		if (element instanceof EntityType) {
			generalizesCRAIndex((EntityType) element, model, cohesive);
		} 
		//RelationshipType
		else if (element instanceof RelationshipType){		
			relationshipTypeCRAIndex((RelationshipType) element, model, cohesive);	
		}
		//Procedure
		else if (element instanceof Procedure) {
			accessEntityTypeCRAIndex((Procedure) element, model, cohesive);
		}		
	}

	private static void accessEntityTypeCRAIndex(Procedure element, MEERModel model, Cohesive cohesive) {
				
	}

	private static void relationshipTypeCRAIndex(RelationshipType relationshipType, MEERModel model, Cohesive cohesive) {
		//Links to Entities
		for (LinkToEntity linkToEntity : relationshipType.getLinksToEntities()) {
			entityTypeCRAIndex(linkToEntity.getEntity().eContainer(), relationshipType.eContainer(), cohesive);			
		}		
	}

	private static void entityTypeCRAIndex(EObject eContainer, EObject eContainer2, Cohesive cohesive) {
		if (EcoreUtil.equals(eContainer, eContainer2) == true)
			cohesive.incrementCohesion(); //Cohesion
		else { 			
			cohesive.incrementCoupling(); //Cohesion
		}		
	}

	private static void generalizesCRAIndex(EntityType element, MEERModel model, Cohesive cohesive) {
		
		
	}
}