package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER_API")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class TeacherEntity {
	

		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
		long id;
		
		@Column
		String name;
		 
		@Column
		String address;
		
		@Column
		String phoneNo;
		 
		@Column
		String email;

		public TeacherEntity() {
			
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

}
