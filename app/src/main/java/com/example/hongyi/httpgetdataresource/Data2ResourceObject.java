package com.example.hongyi.httpgetdataresource;

/**
 * Created by hongyi on 2017/12/22.
 */

public class Data2ResourceObject {

    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}

class Data {

    private String uPDATETIME;
    private Park[] park = null;

    public String getUPDATETIME() {
        return uPDATETIME;
    }

    public void setUPDATETIME(String uPDATETIME) {
        this.uPDATETIME = uPDATETIME;
    }

    public Park[] getPark() {
        return park;
    }

    public void setPark(Park[] park) {
        this.park = park;
    }

}

class Park {

    private String id;
    private String area;
    private String name;
    private String type;
    private String type2;
    private String summary;
    private String address;
    private String tel;
    private String payex;
    private String servicetime;
    private String tw97x;
    private String tw97y;
    private String totalcar;
    private String totalmotor;
    private String totalbike;
    private String pregnancyFirst;
    private String handicapFirst;
    private String tOTALLARGEMOTOR;
    private String chargingStation;
    private FareInfo fareInfo;
    private Entrancecoord entrancecoord;
    private ChargeStation chargeStation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPayex() {
        return payex;
    }

    public void setPayex(String payex) {
        this.payex = payex;
    }

    public String getServicetime() {
        return servicetime;
    }

    public void setServicetime(String servicetime) {
        this.servicetime = servicetime;
    }

    public String getTw97x() {
        return tw97x;
    }

    public void setTw97x(String tw97x) {
        this.tw97x = tw97x;
    }

    public String getTw97y() {
        return tw97y;
    }

    public void setTw97y(String tw97y) {
        this.tw97y = tw97y;
    }

    public String getTotalcar() {
        return totalcar;
    }

    public void setTotalcar(String totalcar) {
        this.totalcar = totalcar;
    }

    public String getTotalmotor() {
        return totalmotor;
    }

    public void setTotalmotor(String totalmotor) {
        this.totalmotor = totalmotor;
    }

    public String getTotalbike() {
        return totalbike;
    }

    public void setTotalbike(String totalbike) {
        this.totalbike = totalbike;
    }

    public String getPregnancyFirst() {
        return pregnancyFirst;
    }

    public void setPregnancyFirst(String pregnancyFirst) {
        this.pregnancyFirst = pregnancyFirst;
    }

    public String getHandicapFirst() {
        return handicapFirst;
    }

    public void setHandicapFirst(String handicapFirst) {
        this.handicapFirst = handicapFirst;
    }

    public String getTOTALLARGEMOTOR() {
        return tOTALLARGEMOTOR;
    }

    public void setTOTALLARGEMOTOR(String tOTALLARGEMOTOR) {
        this.tOTALLARGEMOTOR = tOTALLARGEMOTOR;
    }

    public String getChargingStation() {
        return chargingStation;
    }

    public void setChargingStation(String chargingStation) {
        this.chargingStation = chargingStation;
    }

    public FareInfo getFareInfo() {
        return fareInfo;
    }

    public void setFareInfo(FareInfo fareInfo) {
        this.fareInfo = fareInfo;
    }

    public Entrancecoord getEntrancecoord() {
        return entrancecoord;
    }

    public void setEntrancecoord(Entrancecoord entrancecoord) {
        this.entrancecoord = entrancecoord;
    }

    public ChargeStation getChargeStation() {
        return chargeStation;
    }

    public void setChargeStation(ChargeStation chargeStation) {
        this.chargeStation = chargeStation;
    }

}

class ChargeStation {

    private String stationName;
    private String stationAddr;
    private String locLongitude;
    private String locLatitude;
    private String openFlag;
    private String isCharge;
    private String contactName;
    private String contactMobilNo;
    private String scoketCount;
    private String availableCount;
    private String country;
    private String town;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationAddr() {
        return stationAddr;
    }

    public void setStationAddr(String stationAddr) {
        this.stationAddr = stationAddr;
    }

    public String getLocLongitude() {
        return locLongitude;
    }

    public void setLocLongitude(String locLongitude) {
        this.locLongitude = locLongitude;
    }

    public String getLocLatitude() {
        return locLatitude;
    }

    public void setLocLatitude(String locLatitude) {
        this.locLatitude = locLatitude;
    }

    public String getOpenFlag() {
        return openFlag;
    }

    public void setOpenFlag(String openFlag) {
        this.openFlag = openFlag;
    }

    public String getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(String isCharge) {
        this.isCharge = isCharge;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobilNo() {
        return contactMobilNo;
    }

    public void setContactMobilNo(String contactMobilNo) {
        this.contactMobilNo = contactMobilNo;
    }

    public String getScoketCount() {
        return scoketCount;
    }

    public void setScoketCount(String scoketCount) {
        this.scoketCount = scoketCount;
    }

    public String getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(String availableCount) {
        this.availableCount = availableCount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

}

class Entrancecoord {

    private EntrancecoordInfo[] entrancecoordInfo = null;

    public EntrancecoordInfo[] getEntrancecoordInfo() {
        return entrancecoordInfo;
    }

    public void setEntrancecoordInfo(EntrancecoordInfo[] entrancecoordInfo) {
        this.entrancecoordInfo = entrancecoordInfo;
    }

}

class EntrancecoordInfo {

    private String xcod;
    private String ycod;
    private String addresss;

    public String getXcod() {
        return xcod;
    }

    public void setXcod(String xcod) {
        this.xcod = xcod;
    }

    public String getYcod() {
        return ycod;
    }

    public void setYcod(String ycod) {
        this.ycod = ycod;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

}

class FareInfo {

    private WorkingDay[] workingDay = null;
    private Holiday[] holiday = null;

    public WorkingDay[] getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(WorkingDay[] workingDay) {
        this.workingDay = workingDay;
    }

    public Holiday[] getHoliday() {
        return holiday;
    }

    public void setHoliday(Holiday[] holiday) {
        this.holiday = holiday;
    }

}

class Holiday {

    private String period;
    private String fare;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

}

class WorkingDay {

    private String period;
    private String fare;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

}
