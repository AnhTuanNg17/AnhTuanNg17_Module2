package CaseStudy.model;

public class Contract {
    private String contractNumber;
    private String bookingId;
    private int deposits; // tiền đặt cọc
    private int totalPayment; // tổng tiền thanh toán
    private String customerId;

    public Contract(){
    }

    public Contract(String contractNumber, String bookingId, int deposits, int totalPayment, String customerId) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.deposits = deposits;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getDeposits() {
        return deposits;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", deposits=" + deposits +
                ", totalPayment=" + totalPayment +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
