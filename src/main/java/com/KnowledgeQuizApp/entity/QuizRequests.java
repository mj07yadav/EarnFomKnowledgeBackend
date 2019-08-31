package com.KnowledgeQuizApp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="quiz_requests")
public class QuizRequests {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long requestid;
	
	@OneToOne
	private UserStuff whoshared;
	
	@Transient
	private String whosharedid;
	
	@Transient
	private String towhomesharedid;
	
	@OneToOne
	private UserStuff towhomeshared;
	
	@Column(name="timeofrequest")
	private Date timeofrequest;
	
	@Column(name="timeoffullfilment")
	private Date timeoffullfilment;

	public long getRequestid() {
		return requestid;
	}

	public void setRequestid(long requestid) {
		this.requestid = requestid;
	}

	public UserStuff getWhoshared() {
		return whoshared;
	}

	public void setWhoshared(UserStuff whoshared) {
		this.whoshared = whoshared;
	}

	public UserStuff getTowhomeshared() {
		return towhomeshared;
	}

	public void setTowhomeshared(UserStuff towhomeshared) {
		this.towhomeshared = towhomeshared;
	}

	public Date getTimeofrequest() {
		return timeofrequest;
	}

	public void setTimeofrequest(Date timeofrequest) {
		this.timeofrequest = timeofrequest;
	}

	public Date getTimeoffullfilment() {
		return timeoffullfilment;
	}

	public void setTimeoffullfilment(Date timeoffullfilment) {
		this.timeoffullfilment = timeoffullfilment;
	}

	public String getWhosharedid() {
		return whosharedid;
	}

	public void setWhosharedid(String whosharedid) {
		this.whosharedid = whosharedid;
	}

	public String getTowhomesharedid() {
		return towhomesharedid;
	}

	public void setTowhomesharedid(String towhomesharedid) {
		this.towhomesharedid = towhomesharedid;
	}
	
	
	
}
