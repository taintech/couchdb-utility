package com.taintech.couchdb.utility

/**
 * Author: Rinat Tainov 
 * Date: 30/08/15
 */
object DummyCouchDB extends CouchDB{
  override val ROOT_URL = "http://127.0.0.1:5984"

  def main(args: Array[String]) = println(test)
}
