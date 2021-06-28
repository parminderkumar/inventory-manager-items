package com.parminder.inventorymanageritems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.parminder.inventorymanageritems.service.ItemsService;
import com.parminder.inventorymanageritems.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/inventorymanager")
public class ItemsController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	ItemsService itemsService;

	@GetMapping("/items")
	public @ResponseBody List<Item> listItems() {
		logger.info("list recieved");
		return itemsService.getItems();
	}

	@PutMapping("/items")
	public void updateItem(@RequestBody Item item) {
		itemsService.updateItem(item);
	}

	@DeleteMapping("/items/{id}")
	public void deleteStudent(@PathVariable int id) {
		itemsService.deleteItem(id);
	}

	@PostMapping("/items")
	public void addItem(@RequestBody Item item) {
		itemsService.addItem(item);
	}
}
