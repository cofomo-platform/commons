package org.cofomo.commons.domain.exploration;

import java.util.List;

import javax.persistence.Embeddable;

@Embeddable
public class MobilityProviderEmbedded extends MobilityProviderSuper {
	public MobilityProviderEmbedded(String name, String url, List<Integer> areas, List<String> offers) {
		super(name, url, areas, offers);
	}

}
