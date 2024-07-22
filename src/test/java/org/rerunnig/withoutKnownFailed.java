package org.rerunnig;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class withoutKnownFailed implements IAnnotationTransformer{

	
	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		
//		a.setRetryAnalyzer(WithKnownFailed.class);
		IRetryAnalyzer r=a.getRetryAnalyzer();
		 
		a.setRetryAnalyzer(WithKnownFailed.class);
		
	}

}
