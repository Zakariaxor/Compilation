package comp;

import java.util.List;

public class lex extends ulreserv {
	public void lexicale(List<String> liste) {
		int i = 0;
		
		while (i < mots.size()) {
			if (UL_reserve(mots.get(i)) != null) {
				sortie_lexic.add(UL_reserve(mots.get(i)));
			} else if (id(mots.get(i)) != null) {
				sortie_lexic.add(id(mots.get(i)));
			} else if (num(mots.get(i)) != null) {
				sortie_lexic.add(num(mots.get(i)));
			} 
			else sortie_lexic.add("Erreur");

			i++;
		}

	}


}
