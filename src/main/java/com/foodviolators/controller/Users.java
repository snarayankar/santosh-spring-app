package com.foodviolators.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data	
@Entity
@Table(name="USERS")
@EntityListeners(AuditingEntityListener.class)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@DynamicUpdate
public class Users {
	
		@Id
		@Column(name = "USER_ID")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long userId;
		
		@Column(name = "FIRST_NAME")
		@NotNull(message="First Name is mandatory")
		private String firstName;
		
		@Column(name = "LAST_NAME")
		@NotNull(message="Last Name is mandatory")
		private String lastName;
		
		@Column(name = "EMAIL")
		@NotNull(message="Email is mandatory")
		private String email;
		
	/*	@Column(name = "MCAT_ADMIN_ID")
		private Long mcatAdminId;
		
		@Column(name ="FORM_CD")
		private String formCode;
		
		@Column(name ="EXAM_SERIES")
		private String examSeries;
		
		@Column(name ="AAMC_AUTH_ID")
		private Long aamcAuthorizationId;
		
		@Column(name ="EVENT_TYPE" )
		@NotNull(message="Reservation event type is mandatory")
		@Enumerated(EnumType.STRING)
		private ReservationEventTypeEum eventType;
		
		@Column(name = "EVENT_DT")
		@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
		@DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
		@NotNull(message="Event date is mandatory")
		private LocalDateTime eventDate;
		
		@Column(name ="ACCOM_TYPE")
		private String accommodationTypes;
		
		@Column(name ="VENDOR_SITE_CD")
		@NotNull(message="Vendor Site code is mandatory")
		private String vendorSiteCode;
		
		@Column(name ="VENDOR_RESV_ID", unique=true)
		@NotNull(message="Vendor reservation id is mandatory")
		private String vendorReservationId;
		
		@Column(name ="VENDOR_ORDER_NO")
		private String vendorOrderNumber;
		
		@Column(name ="VENDOR_TEST_DATE")
		@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
		@DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss")
		@NotNull(message="Vendor Test date is mandatory")
		private LocalDateTime vendorTestDate;
		
		@Column(name ="DISPLAY_TIMEZONE")
		private String displayTimezone;
		*/
	

}
