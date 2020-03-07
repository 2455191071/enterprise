package com.csdj.enterprise.controller.produce.util;

import com.csdj.enterprise.entity.produce.*;

import java.util.List;

public class PageUtil<T> {
	/**
	 * 当前页索引
	 */
	private int pageIndex;
	/**
	 * 页面大小
	 */
	private int pageSize;
	/**
	 * 总记录数
	 */
	private int number;
	/**
	 * 总页数
	 */
	private int pageNumber;
	/**
	 * 集中生产当前页数据
	 */
	private List<Productionlb> list;
	/**
	 * 生产计划当前页数据
	 */
	private List<Plan> lista;
	/**
	 * 制令单当前页数据
	 */
	private List<Morder> listb;
	/**
	 * 外协单当前页数据
	 */
	private List<Outsourcing> listc;
	/**
	 * 生产入库当前页数据
	 */
	private List<Pstorage> listd;
	/**
	 * 外协入库当前页数据
	 */
	private List<Ostorage> liste;
	/**
	 * 物料清单当前页数据
	 */
	private List<Bomlb> listf;


	public List<Bomlb> getListf() {
		return listf;
	}
	public void setListf(List<Bomlb> listf) {
		this.listf = listf;
	}
	public List<Outsourcing> getListc() {
		return listc;
	}
	public void setListc(List<Outsourcing> listc) {
		this.listc = listc;
	}
	public List<Pstorage> getListd() {
		return listd;
	}
	public void setListd(List<Pstorage> listd) {
		this.listd = listd;
	}
	public List<Ostorage> getListe() {
		return liste;
	}
	public void setListe(List<Ostorage> liste) {
		this.liste = liste;
	}
	public List<Morder> getListb() {
		return listb;
	}
	public void setListb(List<Morder> listb) {
		this.listb = listb;
	}
	public List<Plan> getLista() {
		return lista;
	}
	public void setLista(List<Plan> lista) {
		this.lista = lista;
	}
	public List<Productionlb> getList() {
		return list;
	}
	public void setList(List<Productionlb> list) {
		this.list = list;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
}
