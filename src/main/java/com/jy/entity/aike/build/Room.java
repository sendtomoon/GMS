package com.jy.entity.aike.build;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;
@Alias("Room")
public class Room extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1509607847700815082L;

	// ID
	private String id;
	// 产品类型。0：住宅；1：院子；2：商业；3：公寓；4：地下室；5：储藏室；6：车位；
	private String buildingType;
	// 产品性质。1：标准层；2：标准车位；3：40产权；4：70产权；5：储藏室；6：底层；7：地下室；8：顶层；9：加宽车位；10：加宽加长；11：加长车位；12：子母车位；
	private String fundType;
	// 购买者姓名
	private String buyerName;
	// 销售类型。0：已销售；1：未销售；2：赠送；3：自持；
	private String sellType;
	// 所属地块
	private String areaId;
	// 所属建筑
	private String buildingId;
	// 单元号
	private String unitId;
	// 房间号
	private String roomNo;
	// 房号
	private String roomNo2;
	// 支付方式。1：公积金；2：商业贷款；3：公积金；4：一次性；5：公积金贷款；6：市公积金；7：市直公积金；8：百分之七十；9：百分之三十；10：省直公积金；11：市办公积金；
	private String payWay;
	// 签约情况。0：未签约；1：已签约；
	private String signInfo;
	// 签约日期
	private String signDate;
	// 合同号
	private String agreementNo;
	// 认购日期
	private String subscrDate;
	// 原面积
	private String areaPlan;
	// 预测绘面积
	private String areaMeasur;
	// 面积差
	private String areaMiner;
	// 是否有装修
	private String isDecor;
	// 成交单价
	private String singlePrice;
	// 合同总额
	private String allPrice;
	// 首付比例
	private String firstPayParten;
	// 已收款
	private String payedManey;
	// 未回款
	private String oewMoney;
	// 按揭额度
	private String loanMoney;
	// 是否放款；0：客户办理；1：已放款；2：办理中；3：一次性；4：一次性付清，自办公积金；
	private String is_reciveMoney;
	// 装修标准。
	private String decorLevel;
	// 装修金额
	private String decorMoney;
	// 交房日期
	private String giveRooomDate;
	// 放款日期
	private String recviceMoneyDate;
	// 贷款银行
	private String oweBank;
	// 贷款年限
	private String oweYear;
	// 销售顾问姓名
	private String sellerName;
	// 销售顾问身份证
	private String sellerId;
	// 银行签约日期
	private String bankSingDate;
	// 抵押日期
	private String mortgageDate;
	// 出证日期
	private String deedDate;
	// 领取合同日期（银行）
	private String giveAgreementDateBank;
	// 领取合同日期（客户）
	private String giveAgreementDateUser;
	// 原签银行
	private String oldBank;
	// 转行日期
	private String oldBankTransferDate;
	// 按揭资料是否提交。0：否；1：是；
	private String mortgageInfoCommit;
	// 受理客户经理
	private String uaerManager;
	// 中介名称
	private String angecyName;
	// 解决问题时间(4-8日 更新
	private String resloveDate;
	// 备案日期
	private String filingDate;
	// 预告日期
	private String forecastDate;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the buildingType
	 */
	public String getBuildingType() {
		return buildingType;
	}

	/**
	 * @param buildingType
	 *            the buildingType to set
	 */
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	/**
	 * @return the sellType
	 */
	public String getSellType() {
		return sellType;
	}

	/**
	 * @param sellType
	 *            the sellType to set
	 */
	public void setSellType(String sellType) {
		this.sellType = sellType;
	}

	/**
	 * @return the areaId
	 */
	public String getAreaId() {
		return areaId;
	}

	/**
	 * @param areaId
	 *            the areaId to set
	 */
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	/**
	 * @return the buildingId
	 */
	public String getBuildingId() {
		return buildingId;
	}

	/**
	 * @param buildingId
	 *            the buildingId to set
	 */
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	/**
	 * @return the unitId
	 */
	public String getUnitId() {
		return unitId;
	}

	/**
	 * @param unitId
	 *            the unitId to set
	 */
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	/**
	 * @return the payWay
	 */
	public String getPayWay() {
		return payWay;
	}

	/**
	 * @param payWay
	 *            the payWay to set
	 */
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	/**
	 * @return the signInfo
	 */
	public String getSignInfo() {
		return signInfo;
	}

	/**
	 * @param signInfo
	 *            the signInfo to set
	 */
	public void setSignInfo(String signInfo) {
		this.signInfo = signInfo;
	}

	/**
	 * @return the signDate
	 */
	public String getSignDate() {
		return signDate;
	}

	/**
	 * @param signDate
	 *            the signDate to set
	 */
	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	/**
	 * @return the agreementNo
	 */
	public String getAgreementNo() {
		return agreementNo;
	}

	/**
	 * @param agreementNo
	 *            the agreementNo to set
	 */
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	/**
	 * @return the subscrDate
	 */
	public String getSubscrDate() {
		return subscrDate;
	}

	/**
	 * @param subscrDate
	 *            the subscrDate to set
	 */
	public void setSubscrDate(String subscrDate) {
		this.subscrDate = subscrDate;
	}

	/**
	 * @return the areaPlan
	 */
	public String getAreaPlan() {
		return areaPlan;
	}

	/**
	 * @param areaPlan
	 *            the areaPlan to set
	 */
	public void setAreaPlan(String areaPlan) {
		this.areaPlan = areaPlan;
	}

	/**
	 * @return the areaMeasur
	 */
	public String getAreaMeasur() {
		return areaMeasur;
	}

	/**
	 * @param areaMeasur
	 *            the areaMeasur to set
	 */
	public void setAreaMeasur(String areaMeasur) {
		this.areaMeasur = areaMeasur;
	}

	/**
	 * @return the areaMiner
	 */
	public String getAreaMiner() {
		return areaMiner;
	}

	/**
	 * @param areaMiner
	 *            the areaMiner to set
	 */
	public void setAreaMiner(String areaMiner) {
		this.areaMiner = areaMiner;
	}

	/**
	 * @return the isDecor
	 */
	public String getIsDecor() {
		return isDecor;
	}

	/**
	 * @param isDecor
	 *            the isDecor to set
	 */
	public void setIsDecor(String isDecor) {
		this.isDecor = isDecor;
	}

	/**
	 * @return the singlePrice
	 */
	public String getSinglePrice() {
		return singlePrice;
	}

	/**
	 * @param singlePrice
	 *            the singlePrice to set
	 */
	public void setSinglePrice(String singlePrice) {
		this.singlePrice = singlePrice;
	}

	/**
	 * @return the allPrice
	 */
	public String getAllPrice() {
		return allPrice;
	}

	/**
	 * @param allPrice
	 *            the allPrice to set
	 */
	public void setAllPrice(String allPrice) {
		this.allPrice = allPrice;
	}

	/**
	 * @return the firstPayParten
	 */
	public String getFirstPayParten() {
		return firstPayParten;
	}

	/**
	 * @param firstPayParten
	 *            the firstPayParten to set
	 */
	public void setFirstPayParten(String firstPayParten) {
		this.firstPayParten = firstPayParten;
	}

	/**
	 * @return the payedManey
	 */
	public String getPayedManey() {
		return payedManey;
	}

	/**
	 * @param payedManey
	 *            the payedManey to set
	 */
	public void setPayedManey(String payedManey) {
		this.payedManey = payedManey;
	}

	/**
	 * @return the oewMoney
	 */
	public String getOewMoney() {
		return oewMoney;
	}

	/**
	 * @param oewMoney
	 *            the oewMoney to set
	 */
	public void setOewMoney(String oewMoney) {
		this.oewMoney = oewMoney;
	}

	/**
	 * @return the loanMoney
	 */
	public String getLoanMoney() {
		return loanMoney;
	}

	/**
	 * @param loanMoney
	 *            the loanMoney to set
	 */
	public void setLoanMoney(String loanMoney) {
		this.loanMoney = loanMoney;
	}

	/**
	 * @return the is_reciveMoney
	 */
	public String getIs_reciveMoney() {
		return is_reciveMoney;
	}

	/**
	 * @param is_reciveMoney
	 *            the is_reciveMoney to set
	 */
	public void setIs_reciveMoney(String is_reciveMoney) {
		this.is_reciveMoney = is_reciveMoney;
	}

	/**
	 * @return the decorLevel
	 */
	public String getDecorLevel() {
		return decorLevel;
	}

	/**
	 * @param decorLevel
	 *            the decorLevel to set
	 */
	public void setDecorLevel(String decorLevel) {
		this.decorLevel = decorLevel;
	}

	/**
	 * @return the decorMoney
	 */
	public String getDecorMoney() {
		return decorMoney;
	}

	/**
	 * @param decorMoney
	 *            the decorMoney to set
	 */
	public void setDecorMoney(String decorMoney) {
		this.decorMoney = decorMoney;
	}

	/**
	 * @return the giveRooomDate
	 */
	public String getGiveRooomDate() {
		return giveRooomDate;
	}

	/**
	 * @param giveRooomDate
	 *            the giveRooomDate to set
	 */
	public void setGiveRooomDate(String giveRooomDate) {
		this.giveRooomDate = giveRooomDate;
	}

	/**
	 * @return the recviceMoneyDate
	 */
	public String getRecviceMoneyDate() {
		return recviceMoneyDate;
	}

	/**
	 * @param recviceMoneyDate
	 *            the recviceMoneyDate to set
	 */
	public void setRecviceMoneyDate(String recviceMoneyDate) {
		this.recviceMoneyDate = recviceMoneyDate;
	}

	/**
	 * @return the oweBank
	 */
	public String getOweBank() {
		return oweBank;
	}

	/**
	 * @param oweBank
	 *            the oweBank to set
	 */
	public void setOweBank(String oweBank) {
		this.oweBank = oweBank;
	}

	/**
	 * @return the oweYear
	 */
	public String getOweYear() {
		return oweYear;
	}

	/**
	 * @param oweYear
	 *            the oweYear to set
	 */
	public void setOweYear(String oweYear) {
		this.oweYear = oweYear;
	}

	/**
	 * @return the sellerName
	 */
	public String getSellerName() {
		return sellerName;
	}

	/**
	 * @param sellerName
	 *            the sellerName to set
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	/**
	 * @return the sellerId
	 */
	public String getSellerId() {
		return sellerId;
	}

	/**
	 * @param sellerId
	 *            the sellerId to set
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * @return the bankSingDate
	 */
	public String getBankSingDate() {
		return bankSingDate;
	}

	/**
	 * @param bankSingDate
	 *            the bankSingDate to set
	 */
	public void setBankSingDate(String bankSingDate) {
		this.bankSingDate = bankSingDate;
	}

	/**
	 * @return the mortgageDate
	 */
	public String getMortgageDate() {
		return mortgageDate;
	}

	/**
	 * @param mortgageDate
	 *            the mortgageDate to set
	 */
	public void setMortgageDate(String mortgageDate) {
		this.mortgageDate = mortgageDate;
	}

	/**
	 * @return the deedDate
	 */
	public String getDeedDate() {
		return deedDate;
	}

	/**
	 * @param deedDate
	 *            the deedDate to set
	 */
	public void setDeedDate(String deedDate) {
		this.deedDate = deedDate;
	}

	/**
	 * @return the giveAgreementDateBank
	 */
	public String getGiveAgreementDateBank() {
		return giveAgreementDateBank;
	}

	/**
	 * @param giveAgreementDateBank
	 *            the giveAgreementDateBank to set
	 */
	public void setGiveAgreementDateBank(String giveAgreementDateBank) {
		this.giveAgreementDateBank = giveAgreementDateBank;
	}

	/**
	 * @return the giveAgreementDateUser
	 */
	public String getGiveAgreementDateUser() {
		return giveAgreementDateUser;
	}

	/**
	 * @param giveAgreementDateUser
	 *            the giveAgreementDateUser to set
	 */
	public void setGiveAgreementDateUser(String giveAgreementDateUser) {
		this.giveAgreementDateUser = giveAgreementDateUser;
	}

	/**
	 * @return the oldBank
	 */
	public String getOldBank() {
		return oldBank;
	}

	/**
	 * @param oldBank
	 *            the oldBank to set
	 */
	public void setOldBank(String oldBank) {
		this.oldBank = oldBank;
	}

	/**
	 * @return the oldBankTransferDate
	 */
	public String getOldBankTransferDate() {
		return oldBankTransferDate;
	}

	/**
	 * @param oldBankTransferDate
	 *            the oldBankTransferDate to set
	 */
	public void setOldBankTransferDate(String oldBankTransferDate) {
		this.oldBankTransferDate = oldBankTransferDate;
	}

	/**
	 * @return the mortgageInfoCommit
	 */
	public String getMortgageInfoCommit() {
		return mortgageInfoCommit;
	}

	/**
	 * @param mortgageInfoCommit
	 *            the mortgageInfoCommit to set
	 */
	public void setMortgageInfoCommit(String mortgageInfoCommit) {
		this.mortgageInfoCommit = mortgageInfoCommit;
	}

	/**
	 * @return the uaerManager
	 */
	public String getUaerManager() {
		return uaerManager;
	}

	/**
	 * @param uaerManager
	 *            the uaerManager to set
	 */
	public void setUaerManager(String uaerManager) {
		this.uaerManager = uaerManager;
	}

	/**
	 * @return the angecyName
	 */
	public String getAngecyName() {
		return angecyName;
	}

	/**
	 * @param angecyName
	 *            the angecyName to set
	 */
	public void setAngecyName(String angecyName) {
		this.angecyName = angecyName;
	}

	/**
	 * @return the resloveDate
	 */
	public String getResloveDate() {
		return resloveDate;
	}

	/**
	 * @param resloveDate
	 *            the resloveDate to set
	 */
	public void setResloveDate(String resloveDate) {
		this.resloveDate = resloveDate;
	}

	/**
	 * @return the filingDate
	 */
	public String getFilingDate() {
		return filingDate;
	}

	/**
	 * @param filingDate
	 *            the filingDate to set
	 */
	public void setFilingDate(String filingDate) {
		this.filingDate = filingDate;
	}

	/**
	 * @return the forecastDate
	 */
	public String getForecastDate() {
		return forecastDate;
	}

	/**
	 * @param forecastDate
	 *            the forecastDate to set
	 */
	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	/**
	 * @return the buyerName
	 */
	public String getBuyerName() {
		return buyerName;
	}

	/**
	 * @param buyerName the buyerName to set
	 */
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	/**
	 * @return the roomNo2
	 */
	public String getRoomNo2() {
		return roomNo2;
	}

	/**
	 * @param roomNo2 the roomNo2 to set
	 */
	public void setRoomNo2(String roomNo2) {
		this.roomNo2 = roomNo2;
	}

	/**
	 * @return the fundType
	 */
	public String getFundType() {
		return fundType;
	}

	/**
	 * @param fundType the fundType to set
	 */
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	/**
	 * @return the roomNo
	 */
	public String getRoomNo() {
		return roomNo;
	}

	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

}
