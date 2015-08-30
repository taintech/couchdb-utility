package com.taintech.couchdb.utility

/**
 * Author: Rinat Tainov 
 * Date: 30/08/15
 */
trait UUID {
  def generate = java.util.UUID.randomUUID.toString
}
