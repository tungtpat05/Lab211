/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package constants;

/**
 *
 * @author nguye
 */
public enum Specialization {
    TIM_MACH("Tim mạch"),
    DA_LIEU("Da liễu"),
    THAN_KINH("Thần kinh"),
    NHI_KHOA("Nhi khoa"),
    SAN_PHU_KHOA("Sản - Phụ khoa"),
    TAI_MUI_HONG("Tai - Mũi - Họng"),
    CO_XUONG_KHOP("Cơ xương khớp");

    private final String displayName;

    Specialization(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
