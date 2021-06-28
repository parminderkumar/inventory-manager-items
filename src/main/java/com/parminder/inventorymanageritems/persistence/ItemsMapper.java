package com.parminder.inventorymanageritems.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.parminder.inventorymanageritems.model.Item;

@Mapper
public interface ItemsMapper {

	public List<Item> getItems();

	public void updateItem(Item item);

	public void deleteItem(int id);

	public void addItem(Item item);
}
