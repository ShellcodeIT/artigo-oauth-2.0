package br.com.shellcode.artigo.rs;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class JaxRsConfig extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(OAuthProvider.class);
		return resources;
	}
}
