package com.teaspoon.teamall.domain.product.mapper;

import com.teaspoon.teamall.domain.order.dto.OrderProductResponseDTO;
import com.teaspoon.teamall.domain.product.dto.ProductDTO;
import com.teaspoon.teamall.domain.product.dto.ProductRequestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDTO> getProductList();

    ProductDTO getProductDetail(int productNo);

    List<ProductDTO> searchProduct(String searchType, String searchWord);
    void productRegist(ProductDTO productDTO);

    Integer getCateNo(ProductRequestDTO productRequestDTO);
    void productUpdate(ProductDTO productDTO);

    void productDelete(ProductDTO productDTO);

    OrderProductResponseDTO findProductNo(int productNo);

}
