package com.bridgelabz.annotations.useDepricated;

public class LegacyAPI {
	@Deprecated
	public void oldFeature() {
		System.out.println("This is a old feature which are now depricated!");
	}
	
	public void newFeatue() {
		System.out.println("This is a new feature new version of old feature method!");
	}
}
