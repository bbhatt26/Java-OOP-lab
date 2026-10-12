
class PatientBill {
    private double consultationFee;
    private double medicineFee;

    void setConsultationFee(double fee) {
        if (fee >= 0) {
            consultationFee = fee;
        }
    }

    void setMedicineFee(double fee) {
        if (fee >= 0) {
            medicineFee = fee;
        }
    }

    double calculateTotal() {
        return consultationFee + medicineFee;
    }

    void display() {
        System.out.println("Total Bill: " + calculateTotal());
    }
}

class Q8 {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setConsultationFee(300);
        bill.setMedicineFee(500);
        bill.display();
    }
}
