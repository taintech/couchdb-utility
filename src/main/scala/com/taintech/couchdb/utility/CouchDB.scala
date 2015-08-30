package com.taintech.couchdb.utility

import java.io.{StringWriter, InputStream}

import org.apache.commons.io.IOUtils
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder

/**
 * Author: Rinat Tainov 
 * Date: 30/08/15
 */
trait CouchDB {

  val client: HttpClient  =  HttpClientBuilder.create().build()

  def ROOT_URL: String

  def test = get(ROOT_URL)

  def get(url: String): String = {
    val httpGet = new HttpGet(url)
    val response = client.execute(httpGet)
    inputStreamToString(response.getEntity.getContent)
  }

  def inputStreamToString(inputStream: InputStream): String = {
    val sw = new StringWriter()
    IOUtils.copy(inputStream, sw)
    sw.toString
  }


}
