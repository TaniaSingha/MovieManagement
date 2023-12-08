package com.ass.movieManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Production_Company" )
public class ProductionCompany 
{
	    @Id
	    @GenericGenerator(name="auto",strategy = "increment")
		@GeneratedValue(generator="auto")
	    private Long Production_company_id;

	    private Integer id;
	   
	    private String logo_path;
	    private String name;
	    private String origin_country;
		
	    
	    
	    public ProductionCompany() {
			super();
			// TODO Auto-generated constructor stub
		}



		public ProductionCompany(Long Production_Company_id, Integer id, String logoPath, String name, String originCountry) {
			super();
			
			this.Production_company_id=Production_Company_id;
			this.id = id;
			this.logo_path = logoPath;
			this.name = name;
			this.origin_country = originCountry;
		}


		

		public Integer getId() {
			return id;
		}



		public void setId(Integer id) {
			this.id = id;
		}



		public String getLogoPath() {
			return logo_path;
		}



		public void setLogoPath(String logoPath) {
			this.logo_path = logoPath;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getOriginCountry() {
			return origin_country;
		}



		public void setOriginCountry(String originCountry) {
			this.origin_country = originCountry;
		}



		public Long getProduction_Company_id() {
			return Production_company_id;
		}



		public void setProduction_Company_id(Long production_Company_id) {
			Production_company_id = production_Company_id;
		}
	    
	    
	    
	    


}
