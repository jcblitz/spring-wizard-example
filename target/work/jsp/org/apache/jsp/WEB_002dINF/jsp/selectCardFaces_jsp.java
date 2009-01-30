package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class selectCardFaces_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/include.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_commandName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_bind_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_hidden_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path_cssClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_option_value_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_option_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_form_commandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_bind_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_hidden_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_select_path_cssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_option_value_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_option_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_form_commandName.release();
    _jspx_tagPool_c_forEach_varStatus_items.release();
    _jspx_tagPool_spring_bind_path.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_form_hidden_path_nobody.release();
    _jspx_tagPool_form_select_path_cssClass.release();
    _jspx_tagPool_form_option_value_label_nobody.release();
    _jspx_tagPool_form_option_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tfont-family: Arial;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("div img {\n");
      out.write("\tborder: 1px solid #000;\n");
      out.write("\tpadding: 2px;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.card {\n");
      out.write("\ttext-align: center;\n");
      out.write("\twidth: 320px;\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.buttons {\n");
      out.write("\tpadding: 20px 0 0 0;\n");
      out.write("\tclear: both;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.card select {\n");
      out.write("\tmargin: 15px 0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script src=\"http://www.google.com/jsapi\"></script>\n");
      out.write("<script>\n");
      out.write("  // Load jQuery\n");
      out.write("  google.load(\"prototype\", \"1.6.0.3\");\n");
      out.write("\n");
      out.write("  // on page load complete, fire off a jQuery json-p query\n");
      out.write("  // against Google web search\n");
      out.write("  google.setOnLoadCallback(function() {\n");
      out.write("\t  $$('.quantity').each(function(tab_group){  \n");
      out.write("\t\t  $(tab_group).observe('change', calculateTotal);  \n");
      out.write("\t\t});  \n");
      out.write("\n");
      out.write("\t    \n");
      out.write("    });\n");
      out.write("  \n");
      out.write("\n");
      out.write("  function calculateTotal(event) {\n");
      out.write("\t  total = 0;\n");
      out.write("\t  $$('.quantity').each(function(element){  \n");
      out.write("\t\t  if (Form.Element.getValue(element) * 1 > 0) {\n");
      out.write("\t\t  \ttotal+= 1 * Form.Element.getValue(element);  \n");
      out.write("\t\t  }\n");
      out.write("\t\t});  \n");
      out.write("\t  $(\"count\").innerHTML = total;\t  \n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>Card Faces</h1>\n");
      out.write("\n");
      out.write("<p id='target'>This event stuff is <strong>cool</strong>.</p>\n");
      out.write("\n");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_commandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(null);
      _jspx_th_form_form_0.setCommandName("giftCard");
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\n");
            out.write("<div id=\"cards\">\n");
            out.write("\n");
            out.write("\t");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
            _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giftCard.cards}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
            _jspx_th_c_forEach_0.setVarStatus("currentCard");
            int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
            try {
              int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
              if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("\t\n");
                  out.write("\t<div class=\"card\">\n");
                  out.write("\t\n");
                  out.write("\t  ");
                  //  spring:bind
                  org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
                  _jspx_th_spring_bind_0.setPageContext(_jspx_page_context);
                  _jspx_th_spring_bind_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                  _jspx_th_spring_bind_0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("giftCard.cards[${currentCard.index}].card.cardFace", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_spring_bind_0 = new int[] { 0 };
                  try {
                    int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
                    if (_jspx_eval_spring_bind_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      org.springframework.web.servlet.support.BindStatus status = null;
                      status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                      do {
                        out.write("\n");
                        out.write("\t\t  <img class=\"card\" src=\"");
                        out.print(request.getContextPath() );
                        out.write("/images/");
                        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_0, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
                          return;
                        out.write("\" />\n");
                        out.write("\t  ");
                        int evalDoAfterBody = _jspx_th_spring_bind_0.doAfterBody();
                        status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_spring_bind_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_spring_bind_0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_spring_bind_0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_spring_bind_0.doFinally();
                    _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_0);
                  }
                  out.write("\n");
                  out.write("\t  \n");
                  out.write("\t  ");
                  //  spring:bind
                  org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
                  _jspx_th_spring_bind_1.setPageContext(_jspx_page_context);
                  _jspx_th_spring_bind_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                  _jspx_th_spring_bind_1.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("giftCard.cards[${currentCard.index}].card.id", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_spring_bind_1 = new int[] { 0 };
                  try {
                    int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
                    if (_jspx_eval_spring_bind_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      org.springframework.web.servlet.support.BindStatus status = null;
                      status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                      do {
                        out.write("\n");
                        out.write("\t\t  ");
                        if (_jspx_meth_form_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_1, _jspx_page_context, _jspx_push_body_count_spring_bind_1))
                          return;
                        out.write("\n");
                        out.write("\t  ");
                        int evalDoAfterBody = _jspx_th_spring_bind_1.doAfterBody();
                        status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_spring_bind_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_spring_bind_1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_spring_bind_1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_spring_bind_1.doFinally();
                    _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_1);
                  }
                  out.write("\n");
                  out.write("\n");
                  out.write("\tQuantity: \n");
                  out.write("\t   ");
                  //  spring:bind
                  org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
                  _jspx_th_spring_bind_2.setPageContext(_jspx_page_context);
                  _jspx_th_spring_bind_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                  _jspx_th_spring_bind_2.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("giftCard.cards[${currentCard.index}].quantity", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_spring_bind_2 = new int[] { 0 };
                  try {
                    int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
                    if (_jspx_eval_spring_bind_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      org.springframework.web.servlet.support.BindStatus status = null;
                      status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                      do {
                        out.write("\n");
                        out.write("\t   \t\t");
                        //  form:select
                        org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path_cssClass.get(org.springframework.web.servlet.tags.form.SelectTag.class);
                        _jspx_th_form_select_0.setPageContext(_jspx_page_context);
                        _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_2);
                        _jspx_th_form_select_0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.expression}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                        _jspx_th_form_select_0.setCssClass("quantity");
                        int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
                          if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\n");
                              out.write("\t   \t\t\t  ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_0 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_0.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_0.setValue(new String("-1"));
                              _jspx_th_form_option_0.setLabel("Please Select");
                              int[] _jspx_push_body_count_form_option_0 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_0 = _jspx_th_form_option_0.doStartTag();
                              if (_jspx_th_form_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_0[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_0.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_0.doFinally();
                              _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_0);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_1 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_1.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_1.setValue(new String("1"));
                              int[] _jspx_push_body_count_form_option_1 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_1 = _jspx_th_form_option_1.doStartTag();
                              if (_jspx_th_form_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_1[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_1.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_1.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_1);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_2 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_2.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_2.setValue(new String("2"));
                              int[] _jspx_push_body_count_form_option_2 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_2 = _jspx_th_form_option_2.doStartTag();
                              if (_jspx_th_form_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_2[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_2.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_2.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_2);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_3 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_3.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_3.setValue(new String("3"));
                              int[] _jspx_push_body_count_form_option_3 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_3 = _jspx_th_form_option_3.doStartTag();
                              if (_jspx_th_form_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_3[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_3.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_3.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_3);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_4 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_4.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_4.setValue(new String("4"));
                              int[] _jspx_push_body_count_form_option_4 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_4 = _jspx_th_form_option_4.doStartTag();
                              if (_jspx_th_form_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_4[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_4.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_4.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_4);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_5 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_5.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_5.setValue(new String("5"));
                              int[] _jspx_push_body_count_form_option_5 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_5 = _jspx_th_form_option_5.doStartTag();
                              if (_jspx_th_form_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_5[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_5.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_5.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_5);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_6 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_6.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_6.setValue(new String("6"));
                              int[] _jspx_push_body_count_form_option_6 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_6 = _jspx_th_form_option_6.doStartTag();
                              if (_jspx_th_form_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_6[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_6.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_6.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_6);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_7 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_7.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_7.setValue(new String("7"));
                              int[] _jspx_push_body_count_form_option_7 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_7 = _jspx_th_form_option_7.doStartTag();
                              if (_jspx_th_form_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_7[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_7.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_7.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_7);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_8 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_8.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_8.setValue(new String("8"));
                              int[] _jspx_push_body_count_form_option_8 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_8 = _jspx_th_form_option_8.doStartTag();
                              if (_jspx_th_form_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_8[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_8.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_8.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_8);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_9 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_9.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_9.setValue(new String("9"));
                              int[] _jspx_push_body_count_form_option_9 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_9 = _jspx_th_form_option_9.doStartTag();
                              if (_jspx_th_form_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_9[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_9.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_9.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_9);
                              }
                              out.write("\n");
                              out.write("\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_10 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_10.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_10.setValue(new String("10"));
                              int[] _jspx_push_body_count_form_option_10 = new int[] { 0 };
                              try {
                              int _jspx_eval_form_option_10 = _jspx_th_form_option_10.doStartTag();
                              if (_jspx_th_form_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              return;
                              }
                              } catch (Throwable _jspx_exception) {
                              while (_jspx_push_body_count_form_option_10[0]-- > 0)
                              out = _jspx_page_context.popBody();
                              _jspx_th_form_option_10.doCatch(_jspx_exception);
                              } finally {
                              _jspx_th_form_option_10.doFinally();
                              _jspx_tagPool_form_option_value_nobody.reuse(_jspx_th_form_option_10);
                              }
                              out.write("\t             \n");
                              out.write("\t        ");
                              int evalDoAfterBody = _jspx_th_form_select_0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_form_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            return;
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_select_0[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_select_0.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_select_0.doFinally();
                          _jspx_tagPool_form_select_path_cssClass.reuse(_jspx_th_form_select_0);
                        }
                        out.write("\n");
                        out.write("\t    ");
                        int evalDoAfterBody = _jspx_th_spring_bind_2.doAfterBody();
                        status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_spring_bind_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_spring_bind_2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_spring_bind_2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_spring_bind_2.doFinally();
                    _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_2);
                  }
                  out.write("\n");
                  out.write("\t    \n");
                  out.write("\t    </div>\n");
                  out.write("\t    \n");
                  out.write("\t    ");
                  if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
                    return;
                  out.write("\n");
                  out.write("\t          \n");
                  out.write("\t");
                  int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_forEach_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_forEach_0.doFinally();
              _jspx_tagPool_c_forEach_varStatus_items.reuse(_jspx_th_c_forEach_0);
            }
            out.write("\n");
            out.write("\t\n");
            out.write("\t</div>\n");
            out.write("\t\n");
            out.write("\t<div class=\"count\">\n");
            out.write("\t\tYou have selected <span id=\"count\">0</span> out of 10 total\n");
            out.write("\t</div>\n");
            out.write("\t\n");
            out.write("\t<div class=\"buttons\">\n");
            out.write("\t\n");
            out.write("\t<input type=\"submit\" name=\"_cancel\" value=\"Cancel\" />\n");
            out.write("\t<input type=\"submit\" name=\"_target1\" value=\"Add Selected Quantity\" />\n");
            out.write("\t\n");
            out.write("\t</div>\n");
            out.write("\n");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_commandName.reuse(_jspx_th_form_form_0);
      }
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_form_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_1);
    _jspx_th_form_hidden_0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.expression}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_hidden_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_0 = _jspx_th_form_hidden_0.doStartTag();
      if (_jspx_th_form_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_0.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentCard.index == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("  \t\t\t<br style=\"clear: both; margin: 20px 0; padding: 20px 0;\" />\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
