/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Mar 11, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue
	private long id;
	private String country;
	private String city;
	private String postalcode;
	@Autowired
	private Info info;
	
	public Location() {
		super();
		this.postalcode = "50012";
	}
	
	public Location(String city) {
	}
	
	public Location(String country, String city, String postalcode) {
	}
	
	public Location(int id, String country, String city, String postalcode) {	
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPostalcode() {
		return postalcode;
	}
	
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
	public Info getInfo() {
		return info;
	}
	
	public void setInfo(Info info) {
		this.info = info;
	}
	
	@Override
		public String toString() {
			return "Location [id=" + id + ", country=" + country + ", city=" + city + ", postalcode=" + postalcode + "]";  
	}
}
