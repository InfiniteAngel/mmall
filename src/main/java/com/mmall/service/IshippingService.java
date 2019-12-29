package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;

public interface IshippingService {
    public ServerResponse add(Integer userId, Shipping shipping);
    public ServerResponse delete(Integer userId,Integer shippingId);
    ServerResponse update(Integer userId,Shipping shipping);
    ServerResponse<Shipping> selete(Integer userId,Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
