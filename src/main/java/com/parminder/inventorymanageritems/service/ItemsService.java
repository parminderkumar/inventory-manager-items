package com.parminder.inventorymanageritems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parminder.inventorymanageritems.model.Item;
import com.parminder.inventorymanageritems.persistence.ItemsMapper;

@Service
public class ItemsService {
	@Autowired
	ItemsMapper itemsMapper;

	public List<Item> getItems() {

		return itemsMapper.getItems();
	}

	public void updateItem(Item item) {

		itemsMapper.updateItem(item);
	}

	public void deleteItem(int id) {

		itemsMapper.deleteItem(id);
	}

	public void addItem(Item item) {

		itemsMapper.addItem(item);
	}
}
