package com.example.restapi;


public class IIHReserveVDTO {

    private String archiveNumber;
    public String departmentId;
    public String departmentName;
    public String voucherNumber;
    public String SupplierCode;
    public String chargeCode;
    public String description;
    public String containerNumber;
    public String destinationPort;
    public String exchangeRate;
    public String baseCurrency;
    public double baseAmount;
    public double voucherAmount;
    public String originPort;
    public String sttNumber;
    public String voucherCurrency;

    public String getArchiveNumber() {
        return archiveNumber;
    }

    public void setArchiveNumber(String archiveNumber) {
        this.archiveNumber = archiveNumber;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getSupplierCode() {
        return SupplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        SupplierCode = supplierCode;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public double getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(double voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public String getOriginPort() {
        return originPort;
    }

    public void setOriginPort(String originPort) {
        this.originPort = originPort;
    }

    public String getSttNumber() {
        return sttNumber;
    }

    public void setSttNumber(String sttNumber) {
        this.sttNumber = sttNumber;
    }

    public String getVoucherCurrency() {
        return voucherCurrency;
    }

    public void setVoucherCurrency(String voucherCurrency) {
        this.voucherCurrency = voucherCurrency;
    }

    @Override
    public String toString() {
        return "IIHReserveVDTO{" +
                "archiveNumber='" + archiveNumber + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", voucherNumber='" + voucherNumber + '\'' +
                ", SupplierCode='" + SupplierCode + '\'' +
                ", chargeCode='" + chargeCode + '\'' +
                ", description='" + description + '\'' +
                ", containerNumber='" + containerNumber + '\'' +
                ", destinationPort='" + destinationPort + '\'' +
                ", exchangeRate='" + exchangeRate + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", baseAmount='" + baseAmount + '\'' +
                ", voucherAmount='" + voucherAmount + '\'' +
                ", originPort='" + originPort + '\'' +
                ", sttNumber='" + sttNumber + '\'' +
                ", voucherCurrency='" + voucherCurrency + '\'' +
                '}';
    }
}
