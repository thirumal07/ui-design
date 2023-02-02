package com.bds.uidesign.views;

import com.github.appreciated.card.ClickableCard;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("page-ui")
public class PageUI extends AppLayout {

	public PageUI() {
		setContent(cardCenter());

//		Label dra = new Label("test");
//		addToDrawer(dra);

		DrawerToggle toggle = new DrawerToggle();

		H1 title = new H1("MyApp");
		title.getStyle().set("font-size", "var(--lumo-font-size-l)").set("margin", "0");

		Tabs tabs = getTabs();

		addToDrawer(tabs);
		addToNavbar(toggle, title);
	}

	private Tabs getTabs() {
		Tabs tabs = new Tabs();
		tabs.add(createTab(VaadinIcon.DASHBOARD, "Dashboard"), createTab(VaadinIcon.USER_HEART, "Customers"),
				createTab(VaadinIcon.PACKAGE, "Products"),createTab(VaadinIcon.CHART, "Analytics"));
		tabs.setOrientation(Tabs.Orientation.VERTICAL);
		return tabs;
	}

	private Tab createTab(VaadinIcon viewIcon, String viewName) {
		Icon icon = viewIcon.create();
		icon.getStyle().set("box-sizing", "border-box").set("margin-inline-end", "var(--lumo-space-m)")
				.set("margin-inline-start", "var(--lumo-space-xs)").set("padding", "var(--lumo-space-xs)");

		RouterLink link = new RouterLink();
		link.add(icon, new Span(viewName));
		// Demo has no routes
		// link.setRoute(viewClass.java);
		link.setTabIndex(-1);

		return new Tab(link);
	}

	HorizontalLayout horizontalLayout = new HorizontalLayout();

	public HorizontalLayout testCard() {
		ClickableCard card = new ClickableCard();
		card.addClickListener(e -> {
			Notification.show("clicked");
		});
		card.setBackground("lightblue");
		card.setBorderRadius("15px");

		Image image = new Image("https://freesvg.org/img/glibersat_Nioubiteul.png", "My Alt Image");
		image.setSizeFull();
		card.add(image);

		Div div = new Div();
		div.setHeight("300px");
		div.setWidth("200px");
		div.add(card);

		ClickableCard card2 = new ClickableCard();
		card2.setBackground("lightblue");
		card2.setBorderRadius("15px");

		Image image2 = new Image("https://freesvg.org/img/car_topview.png", "My Alt Image");
		image2.setSizeFull();
		card2.add(image2);

		Div div2 = new Div();
		div2.setHeight("300px");
		div2.setWidth("200px");
		div2.add(card2);

		ClickableCard card3 = new ClickableCard();
		card3.setBackground("lightblue");
		card3.setBorderRadius("20px");

		Image image3 = new Image("https://freesvg.org/img/car_topview.png", "My Alt Image");
		image3.setSizeFull();
		card3.add(image3);

		Div div3 = new Div();
		div3.setHeight("300px");
		div3.setWidth("200px");
		div3.add(card3);

		ClickableCard card4 = new ClickableCard();
		Image image4 = new Image("https://freesvg.org/img/glibersat_Nioubiteul.png", "My Alt Image");
		image4.setSizeFull();
		card4.add(image4);

		card4.setBackground("lightblue");
		card4.setBorderRadius("20px");

		Div div4 = new Div();
		div4.setHeight("300px");
		div4.setWidth("200px");
		div4.add(card4);

		ClickableCard card5 = new ClickableCard();
		Image image5 = new Image("https://freesvg.org/img/165649513901300-transport-car-sedan-green.png",
				"My Alt Image");
		image5.setSizeFull();
		card5.add(image5);

		card5.setBackground("lightblue");
		card5.setBorderRadius("20px");

		Div div5 = new Div();
		div5.setHeight("300px");
		div5.setWidth("200px");
		div5.add(card5);

		horizontalLayout.add(div, div2, div3, div4, div5);
		horizontalLayout.setJustifyContentMode(JustifyContentMode.CENTER);
		return horizontalLayout;
	}

	HorizontalLayout horizontalLayout2 = new HorizontalLayout();

	public HorizontalLayout testCard2() {

		ClickableCard card = new ClickableCard();
		card.setBackground("lightblue");
		card.setBorderRadius("15px");

		Image image = new Image("https://freesvg.org/img/glibersat_Nioubiteul.png", "My Alt Image");
		image.setSizeFull();
		card.add(image);

		Div div = new Div();
		div.setHeight("300px");
		div.setWidth("200px");
		div.add(card);

		ClickableCard card2 = new ClickableCard();
		card2.setBackground("lightblue");
		card2.setBorderRadius("15px");

		Image image2 = new Image("https://freesvg.org/img/car_topview.png", "My Alt Image");
		image2.setSizeFull();
		card2.add(image2);

		Div div2 = new Div();
		div2.setHeight("300px");
		div2.setWidth("200px");
		div2.add(card2);

		horizontalLayout2.add(div, div2);
		horizontalLayout2.setJustifyContentMode(JustifyContentMode.CENTER);
		return horizontalLayout2;

	}

	public VerticalLayout cardCenter() {
		VerticalLayout verticalLayout = new VerticalLayout();
		verticalLayout.add(testCard(), testCard2());
		verticalLayout.setAlignItems(Alignment.CENTER);
		verticalLayout.setWidthFull();
		return verticalLayout;
	}
}
