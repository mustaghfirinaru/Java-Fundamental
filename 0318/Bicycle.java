class Bicycle{
    private String ownerName;
    private String TagNo;
    Bicycle(){
        this.ownerName="Unassigned";

    }
    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }
    /**
     * @param tagNo the tagNo to set
     */
    public void setTagNo(String tagNo) {
        this.TagNo = tagNo;
    }
    /**
     * @return the tagNo
     */
    public String getTagNo() {
        return this.TagNo;
    }
    public static void main(String[] args) {
        Bicycle bike;
        bike =new Bicycle();
        bike.setTagNo("2023-981P");
        bike.setOwnerName("Al FA");
        System.out.print(bike.getOwnerName());
        System.out.print(bike.getTagNo());
    }
}