package com.VisaPassport.entities;

import com.VisaPassport.metier.Pagination;

public class Pagination_v2 implements Pagination {

	@Override
	public int[] getPaginationPages(int[] pages, int pas, int numPage) {
		int numGroupe = (int) Math.floor(numPage / pas);
		int debut = numGroupe * pas;
		if (numGroupe == Math.floor(pages.length / pas)) {
			pas = pages.length % pas;
		}
		int fin = debut + pas - 1;
	    int size = fin - debut + 1;
		int subPages[] = new int[size];
		int i;
		for (i = 0; i < size; i++) {
			subPages[i] = debut;
			debut++;
		}
		return subPages;
	}

}
