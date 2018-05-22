package com.diffblue.javademo.nestedobjects.subpackage;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

public class Order {
  public Item item;

  /**
   * Checks if this order has an item.
   */
  public boolean hasItem() {
    if (item == null) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Checks if item is in stock.
   */
  public boolean outOfStock() {
    return false;
  }

  /**
   * Sets the item for this order.
   */
  public boolean setItem(Item item) {
    boolean exists = hasItem();
    this.item = item;
    return exists;
  }

  /**
   * Gets the item for this order.
   */
  public Item getItem() {
    return item;
  }
}
