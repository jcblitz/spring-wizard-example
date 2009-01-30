package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class selectRecipients_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/include.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_commandName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_bind_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_option_value_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_textarea_path_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_form_commandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_bind_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_select_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_option_value_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_textarea_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_form_commandName.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_spring_bind_path.release();
    _jspx_tagPool_form_select_path.release();
    _jspx_tagPool_form_option_value_label_nobody.release();
    _jspx_tagPool_form_input_path_nobody.release();
    _jspx_tagPool_form_textarea_path_nobody.release();
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
      out.write("<style type=\"text/css\">\n");
      out.write("\t.clear {\n");
      out.write("\t\tclear: both;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.card-face {\n");
      out.write("\t\tfloat: left;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
            out.write("\t<h1>Add recipient details </h1>\n");
            out.write("\n");
            out.write("\n");
            out.write("\t");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
            _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giftCard.cardInstances}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
            _jspx_th_c_forEach_0.setVar("currentGiftCard");
            _jspx_th_c_forEach_0.setVarStatus("currentCard");
            int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
            try {
              int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
              if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("\t\t\n");
                  out.write("\t \t<div class=\"card\">\n");
                  out.write("\t\t\t<div class=\"card-face\">\n");
                  out.write("\t\t\t\t<img class=\"card\" src=\"");
                  out.print(request.getContextPath() );
                  out.write("/images/");
                  if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
                    return;
                  out.write("\" />\n");
                  out.write("\t\t\t</div>\n");
                  out.write("\t\t\t<div class=\"card-details\">\n");
                  out.write("\t\t\t\n");
                  out.write("\t\t\t\n");
                  out.write("\t\t\t\t<table>\n");
                  out.write("\t\t\t\t\t<tr>\n");
                  out.write("\t\t\t\t\t\t<td><label>Amount:</label></td>\n");
                  out.write("\t\t\t\t\t\t<td>");
                  //  spring:bind
                  org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
                  _jspx_th_spring_bind_0.setPageContext(_jspx_page_context);
                  _jspx_th_spring_bind_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                  _jspx_th_spring_bind_0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("giftCard.cardInstances[${currentCard.index}].giftAmount", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_spring_bind_0 = new int[] { 0 };
                  try {
                    int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
                    if (_jspx_eval_spring_bind_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      org.springframework.web.servlet.support.BindStatus status = null;
                      status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                      do {
                        out.write("\n");
                        out.write("\t\t\t\t\t\tValue: ");
                        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                        out.write("\n");
                        out.write("\t\t\t   \t\t");
                        //  form:select
                        org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path.get(org.springframework.web.servlet.tags.form.SelectTag.class);
                        _jspx_th_form_select_0.setPageContext(_jspx_page_context);
                        _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
                        _jspx_th_form_select_0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.expression}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                        int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
                          if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\n");
                              out.write("\t\t\t   \t\t\t  ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_0 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_0.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_0.setValue(new String("-1"));
                              _jspx_th_form_option_0.setLabel("- Value -");
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
                              out.write("\t\t\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_1 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_1.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_1.setValue(new String("5.0"));
                              _jspx_th_form_option_1.setLabel("$5.00");
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
                              _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_1);
                              }
                              out.write("\n");
                              out.write("\t\t\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_2 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_2.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_2.setValue(new String("10.0"));
                              _jspx_th_form_option_2.setLabel("$10.00");
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
                              _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_2);
                              }
                              out.write("\n");
                              out.write("\t\t\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_3 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_3.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_3.setValue(new String("15.0"));
                              _jspx_th_form_option_3.setLabel("$15.00");
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
                              _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_3);
                              }
                              out.write("\n");
                              out.write("\t\t\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_4 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_4.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_4.setValue(new String("20.0"));
                              _jspx_th_form_option_4.setLabel("$20.00");
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
                              _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_4);
                              }
                              out.write("\n");
                              out.write("\t\t\t              ");
                              //  form:option
                              org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_5 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value_label_nobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                              _jspx_th_form_option_5.setPageContext(_jspx_page_context);
                              _jspx_th_form_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                              _jspx_th_form_option_5.setValue(new String("25.0"));
                              _jspx_th_form_option_5.setLabel("$25.00");
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
                              _jspx_tagPool_form_option_value_label_nobody.reuse(_jspx_th_form_option_5);
                              }
                              out.write("\n");
                              out.write("\t\t\t        ");
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
                          _jspx_tagPool_form_select_path.reuse(_jspx_th_form_select_0);
                        }
                        out.write("\n");
                        out.write("\t\t\t    ");
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
                  out.write("</td>\n");
                  out.write("\t\t\t\t\t</tr>\n");
                  out.write("\t\t\t\t\t<tr>\n");
                  out.write("\t\t\t\t\t\t<td><label>To (recipient's name): </label></td>\n");
                  out.write("\t\t\t\t\t\t<td>   ");
                  //  spring:bind
                  org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
                  _jspx_th_spring_bind_1.setPageContext(_jspx_page_context);
                  _jspx_th_spring_bind_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                  _jspx_th_spring_bind_1.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("giftCard.cardInstances[${currentCard.index}].toName", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_spring_bind_1 = new int[] { 0 };
                  try {
                    int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
                    if (_jspx_eval_spring_bind_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      org.springframework.web.servlet.support.BindStatus status = null;
                      status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                      do {
                        out.write("\n");
                        out.write("\t\t\t   \t\t");
                        if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_1, _jspx_page_context, _jspx_push_body_count_spring_bind_1))
                          return;
                        out.write("\n");
                        out.write("\t\t\t    ");
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
                  out.write("</td>\n");
                  out.write("\t\t\t\t\t</tr>\n");
                  out.write("\t\t\t\t\t<tr>\n");
                  out.write("\t\t\t\t\t\t<td><label>From (sender's name): </label></td>\n");
                  out.write("\t\t\t\t\t\t<td>    ");
                  //  spring:bind
                  org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
                  _jspx_th_spring_bind_2.setPageContext(_jspx_page_context);
                  _jspx_th_spring_bind_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                  _jspx_th_spring_bind_2.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("giftCard.cardInstances[${currentCard.index}].fromName", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_spring_bind_2 = new int[] { 0 };
                  try {
                    int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
                    if (_jspx_eval_spring_bind_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      org.springframework.web.servlet.support.BindStatus status = null;
                      status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                      do {
                        out.write("\n");
                        out.write("\t\t\t   \t\t");
                        if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_2, _jspx_page_context, _jspx_push_body_count_spring_bind_2))
                          return;
                        out.write("\n");
                        out.write("\t\t\t    ");
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
                  out.write("</td>\n");
                  out.write("\t\t\t\t\t</tr>\n");
                  out.write("\t\t\t\t\t<tr>\n");
                  out.write("\t\t\t\t\t\t<td><label>Recipient's email address: </label></td>\n");
                  out.write("\t\t\t\t\t\t<td> \n");
                  out.write("\t\t\t    ");
                  //  spring:bind
                  org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_3 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
                  _jspx_th_spring_bind_3.setPageContext(_jspx_page_context);
                  _jspx_th_spring_bind_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                  _jspx_th_spring_bind_3.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("giftCard.cardInstances[${currentCard.index}].toAddress", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_spring_bind_3 = new int[] { 0 };
                  try {
                    int _jspx_eval_spring_bind_3 = _jspx_th_spring_bind_3.doStartTag();
                    if (_jspx_eval_spring_bind_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      org.springframework.web.servlet.support.BindStatus status = null;
                      status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                      do {
                        out.write("\n");
                        out.write("\t\t\t   \t\t");
                        if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_3, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
                          return;
                        out.write("\n");
                        out.write("\t\t\t    ");
                        int evalDoAfterBody = _jspx_th_spring_bind_3.doAfterBody();
                        status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_spring_bind_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_spring_bind_3[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_spring_bind_3.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_spring_bind_3.doFinally();
                    _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_3);
                  }
                  out.write("</td>\n");
                  out.write("\t\t\t\t\t</tr>\n");
                  out.write("\t\t\t\t\t<tr>\n");
                  out.write("\t\t\t\t\t\t<td> <label>Message (max 200): </label></td>\n");
                  out.write("\t\t\t\t\t\t<td>    ");
                  //  spring:bind
                  org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_4 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
                  _jspx_th_spring_bind_4.setPageContext(_jspx_page_context);
                  _jspx_th_spring_bind_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
                  _jspx_th_spring_bind_4.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("giftCard.cardInstances[${currentCard.index}].message", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  int[] _jspx_push_body_count_spring_bind_4 = new int[] { 0 };
                  try {
                    int _jspx_eval_spring_bind_4 = _jspx_th_spring_bind_4.doStartTag();
                    if (_jspx_eval_spring_bind_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      org.springframework.web.servlet.support.BindStatus status = null;
                      status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                      do {
                        out.write("\n");
                        out.write("\t\t\t   \t\t");
                        if (_jspx_meth_form_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_4, _jspx_page_context, _jspx_push_body_count_spring_bind_4))
                          return;
                        out.write("\n");
                        out.write("\t\t\t    ");
                        int evalDoAfterBody = _jspx_th_spring_bind_4.doAfterBody();
                        status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_spring_bind_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_spring_bind_4[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_spring_bind_4.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_spring_bind_4.doFinally();
                    _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_4);
                  }
                  out.write("</td>\n");
                  out.write("\t\t\t\t\t</tr>\n");
                  out.write("\t\t\t\t\n");
                  out.write("\t\t\t\t</table>\n");
                  out.write("\t\t\t\n");
                  out.write("\t\t\t\n");
                  out.write("\t\t\t\n");
                  out.write("\t\t\t    \n");
                  out.write("\t\t\t</div>\n");
                  out.write("\t\t</div>\n");
                  out.write("\t\t<div class=\"clear\" />\n");
                  out.write("\t\t\n");
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
              _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
            }
            out.write("\n");
            out.write("\t\n");
            out.write("\t<input type=\"submit\" alignment=\"center\" name=\"_target0\" value=\"Go Back\" />\n");
            out.write("\t<input type=\"submit\" alignment=\"center\" name=\"_target2\" value=\"Continue\" />\n");
            out.write("\n");
            out.write("\n");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentGiftCard.cardFace}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_1);
    _jspx_th_form_input_0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.expression}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_path_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_2);
    _jspx_th_form_input_1.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.expression}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_path_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_3);
    _jspx_th_form_input_2.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.expression}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_path_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_0 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_path_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_4);
    _jspx_th_form_textarea_0.setPath((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.expression}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_textarea_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_0 = _jspx_th_form_textarea_0.doStartTag();
      if (_jspx_th_form_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_0.doFinally();
      _jspx_tagPool_form_textarea_path_nobody.reuse(_jspx_th_form_textarea_0);
    }
    return false;
  }
}
