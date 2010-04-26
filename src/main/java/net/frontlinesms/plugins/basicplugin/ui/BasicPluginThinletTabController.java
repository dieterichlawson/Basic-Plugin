package net.frontlinesms.plugins.basicplugin.ui;

import net.frontlinesms.plugins.BasePluginThinletTabController;
import net.frontlinesms.plugins.basicplugin.BasicPluginPluginController;
import net.frontlinesms.ui.ThinletUiEventHandler;
import net.frontlinesms.ui.UiGeneratorController;

import org.springframework.context.ApplicationContext;

public class BasicPluginThinletTabController extends BasePluginThinletTabController<BasicPluginPluginController> implements ThinletUiEventHandler{

	private ApplicationContext appCon;
	
	private static final String TAB_XML_FILE = "/ui/plugins/basicplugin/basicPluginTab.xml";
	
	public BasicPluginThinletTabController(BasicPluginPluginController pluginController, UiGeneratorController uiController, ApplicationContext appCon) {
		super(pluginController, uiController);
		this.appCon = appCon;
		super.setTabComponent(uiController.loadComponentFromFile(TAB_XML_FILE, this));
	}
	
	public Object getTab(){
		return super.getTabComponent();
	}

}
