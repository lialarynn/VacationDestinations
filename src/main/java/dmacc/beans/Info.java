/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Mar 11, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Info {
	private String population;
	private String monument;
	private String language; 
	
	public Info() {
	}
	
	public Info(String population, String monument, String language) {
	}
	
	public String getPopulation() {
		return population;
	}
	
	public void setPopulation(String population) {
		this.population = population;
	}
	
	public String getMonument() {
		return monument;
	}
	
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "Info [population=" + population + ", monument=" + monument + ", language=" + language + "]";
	}
	
	
}
