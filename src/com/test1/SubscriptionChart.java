package com.test1;

public class SubscriptionChart {
	private Integer subscriptionCode;
	private Integer grUnitEffective;
	private String grUnitEffectiveDate;
	private String grUnitsubscriptionDesc;
	private String grUnitsubscriptionShortDesc;
	private Integer grUnitDecimalPositions;
	private String grUnitsubscriptionSymbol;
	private String grUnitsubscriptionScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SubscriptionChart() {

	}

	public SubscriptionChart(Integer subscriptionCode, Integer grUnitEffective, String grUnitEffectiveDate,
			String grUnitsubscriptionDesc, String grUnitsubscriptionShortDesc, Integer grUnitDecimalPositions,
			String grUnitsubscriptionSymbol, String grUnitsubscriptionScale, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.subscriptionCode = subscriptionCode;
		this.grUnitEffective = grUnitEffective;
		this.grUnitEffectiveDate = grUnitEffectiveDate;
		this.grUnitsubscriptionDesc = grUnitsubscriptionDesc;
		this.grUnitsubscriptionShortDesc = grUnitsubscriptionShortDesc;
		this.grUnitDecimalPositions = grUnitDecimalPositions;
		this.grUnitsubscriptionSymbol = grUnitsubscriptionSymbol;
		this.grUnitsubscriptionScale = grUnitsubscriptionScale;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSubscriptionCode() {
		return subscriptionCode;
	}

	public void setSubscriptionCode(Integer subscriptionCode) {
		this.subscriptionCode = subscriptionCode;
	}

	public Integer getGrUnitEffective() {
		return grUnitEffective;
	}

	public void setGrUnitEffective(Integer grUnitEffective) {
		this.grUnitEffective = grUnitEffective;
	}

	public String getGrUnitEffectiveDate() {
		return grUnitEffectiveDate;
	}

	public void setGrUnitEffectiveDate(String grUnitEffectiveDate) {
		this.grUnitEffectiveDate = grUnitEffectiveDate;
	}

	public String getGrUnitsubscriptionDesc() {
		return grUnitsubscriptionDesc;
	}

	public void setGrUnitsubscriptionDesc(String grUnitsubscriptionDesc) {
		this.grUnitsubscriptionDesc = grUnitsubscriptionDesc;
	}

	public String getGrUnitsubscriptionShortDesc() {
		return grUnitsubscriptionShortDesc;
	}

	public void setGrUnitsubscriptionShortDesc(String grUnitsubscriptionShortDesc) {
		this.grUnitsubscriptionShortDesc = grUnitsubscriptionShortDesc;
	}

	public Integer getGrUnitDecimalPositions() {
		return grUnitDecimalPositions;
	}

	public void setGrUnitDecimalPositions(Integer grUnitDecimalPositions) {
		this.grUnitDecimalPositions = grUnitDecimalPositions;
	}

	public String getGrUnitsubscriptionSymbol() {
		return grUnitsubscriptionSymbol;
	}

	public void setGrUnitsubscriptionSymbol(String grUnitsubscriptionSymbol) {
		this.grUnitsubscriptionSymbol = grUnitsubscriptionSymbol;
	}

	public String getGrUnitsubscriptionScale() {
		return grUnitsubscriptionScale;
	}

	public void setGrUnitsubscriptionScale(String grUnitsubscriptionScale) {
		this.grUnitsubscriptionScale = grUnitsubscriptionScale;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
