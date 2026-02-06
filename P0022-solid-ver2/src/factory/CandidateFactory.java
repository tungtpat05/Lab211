/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import dto.CandidateDTO;
import java.util.HashMap;
import java.util.Map;
import model.Candidate;

/**
 *
 * @author nguye
 */
public class CandidateFactory {

    private static final Map<Integer, CandidateCreator> registry = new HashMap<>();

    //Private constructor
    private CandidateFactory() {

    }

    //Chạy tự động một lần duy nhất khi class được sử dụng lần đầu, tránh quên như khi dùng hàm.
    static {
        registry.put(0, new ExperienceCandidateCreator());
        registry.put(1, new FresherCandidateCreator());
        registry.put(2, new InternshipCandidateCreator());
    }

    public static Candidate create(CandidateDTO candidateDTO) {

        //Xác định creator tạo loại nào
        CandidateCreator creator = registry.get(candidateDTO.getCandidateType());

        //Check xem tồn tại loại candidate không
        if (creator == null) {
            throw new IllegalArgumentException("Unsupported candidate type: " + candidateDTO.getCandidateType());
        }

        //Gọi hàm createCandidate tương ứng với loại candidate
        return creator.createCandidate(candidateDTO);
    }

    // Cho phép đăng ký thêm creator mới nếu có loại mới sau này
    public static void register(int type, CandidateCreator creator) {
        registry.put(type, creator);
    }
}
