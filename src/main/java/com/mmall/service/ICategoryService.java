package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Create by Liangxinyu
 */
public interface ICategoryService {
     ServerResponse addCreategory(String categroyName, Integer parentId);
     ServerResponse updateCategory(Integer categoryId,String categoryName);
     ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
     ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
