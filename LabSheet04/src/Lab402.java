import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Enter student-id:");
        String pref = id.substring(2,5);
        String major;
        while (id.length() != 10) {
            id = JOptionPane.showInputDialog("Enter your ID, again:");
        }
        switch (pref) {
            case "131":
                major = "Information Technology (IT)";
                break;
            case "132":
                major = "Multimedia Technology (MT)";
                break;
            case "133":
                major = "Digital Business Information Technology (BI)";
                break;
            case "134":
                major = "Digital Technology in Mass Communication (DC)";
                break;
            case "135":
                major = "Data Science and Data Analytics (DS)";
                break;
            default:
                major = "Cannot found major";
        }
        JOptionPane.showMessageDialog(null, "Student ID: " + id + "\nMajor: " + major);
    }
}