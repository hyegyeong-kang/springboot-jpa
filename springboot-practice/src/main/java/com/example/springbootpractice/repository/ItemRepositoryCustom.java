package com.example.springbootpractice.repository;

import com.example.springbootpractice.dto.ItemSearchDTO;
import com.example.springbootpractice.dto.MainItemDTO;
import com.example.springbootpractice.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDTO itemSearchDto, Pageable pageable);
    Page<MainItemDTO> getMainItemPage(ItemSearchDTO itemSearchDto, Pageable pageable);
}
