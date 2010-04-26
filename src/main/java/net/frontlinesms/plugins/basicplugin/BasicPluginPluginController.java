package net.frontlinesms.plugins.basicplugin;

import net.frontlinesms.FrontlineSMS;
import net.frontlinesms.plugins.BasePluginController;
import net.frontlinesms.plugins.PluginControllerProperties;
import net.frontlinesms.plugins.PluginInitialisationException;
import net.frontlinesms.plugins.basicplugin.ui.BasicPluginThinletTabController;
import net.frontlinesms.ui.UiGeneratorController;

import org.springframework.context.ApplicationContext;

@PluginControllerProperties(name = "Basic Plugin", iconPath = "/icons/basicplugin_logo_small.png", springConfigLocation = "classpath:net/frontlinesms/plugins/basicplugin/basicplugin-spring-hibernate.xml", hibernateConfigPath = "classpath:net/frontlinesms/plugins/basicplugin/basicplugin.hibernate.cfg.xml")
public class BasicPluginPluginController extends BasePluginController {

	private ApplicationContext appCon;
	private FrontlineSMS frontlineController;
	
	protected Object initThinletTab(UiGeneratorController uiController) {
		return new BasicPluginThinletTabController(this, uiController, appCon).getTab();
	}

	public void deinit() {

	}

	public void init(FrontlineSMS frontlineController, ApplicationContext applicationContext) throws PluginInitialisationException {
		this.appCon = applicationContext;
		this.frontlineController = frontlineController;
	}

}
