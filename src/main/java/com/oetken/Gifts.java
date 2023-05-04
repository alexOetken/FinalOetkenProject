package com.oetken;

public class Gifts implements Cloneable {

        private String organization;

        private int giftYear;

        private String giftAmount;

        private String orgReportedStatement;
        private String website;

        private String orgReportedService;

        private String orgReportedArea;


        public Gifts() { this ("Nothing", 0, "Nothing", "Nothing", "Nothing", "Nothing",  "Nothing"); }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
    }

    public Gifts(String organization, int giftYear, String giftAmount, String orgReportedStatement, String website, String orgReportedService, String orgReportedArea) {
            this.organization = organization;
            this.giftYear = giftYear;
            this.giftAmount = giftAmount;
            this.orgReportedStatement = orgReportedStatement;
            this.website = website;
            this.orgReportedService = orgReportedService;
            this.orgReportedArea = orgReportedArea;
    }

    public String getOrganization() {return organization;}

    public void setOrganization(String organization) {this.organization = organization;}

    public int getGiftYear() {return giftYear;}

    public void setGiftYear(int giftYear) {this.giftYear = giftYear;}

    public String getGiftAmount() {return giftAmount;}

    public void setGiftAmount(String giftAmount) {this.giftAmount = giftAmount;}

    public String getOrgReportedStatement() {return orgReportedStatement;}

    public void setOrgReportedStatement(String orgReportedStatement) {this.orgReportedStatement = orgReportedStatement;}

    public String getWebsite() {return website;}

    public void setWebsite(String website) {this.website = website;}

    public String getOrgReportedService() {return orgReportedService;}

    public void setOrgReportedService(String orgReportedService) {this.orgReportedService = orgReportedService;}

    public String getOrgReportedArea() {return orgReportedArea;}

    public void setOrgReportedArea(String orgReportedArea) {this.orgReportedArea = orgReportedArea;}

}
