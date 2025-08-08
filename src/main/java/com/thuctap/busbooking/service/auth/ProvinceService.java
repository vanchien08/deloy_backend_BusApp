package com.thuctap.busbooking.service.auth;

import java.util.List;

import com.thuctap.busbooking.dto.request.ProvinceRequest;
import com.thuctap.busbooking.entity.Province;

public interface ProvinceService {
    public List<Province> getAllProvinces();

    public List<Province> getAllProvince();

    ProvinceRequest addProvince(ProvinceRequest dto);

    ProvinceRequest updateProvince(int id, ProvinceRequest dto);

    void updateProvinceStatus(int id, int status);
}
