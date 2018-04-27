<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>

<head>
    <style type="text/css">
        /* table 样式 */
        table {
            border-top: 1px solid #ccc;
            border-left: 1px solid #ccc;
        }
        table td,
        table th {
            border-bottom: 1px solid #ccc;
            border-right: 1px solid #ccc;
            padding: 3px 5px;
        }
        table th {
            border-bottom: 2px solid #ccc;
            text-align: center;
        }

        /* blockquote 样式 */
        blockquote {
            display: block;
            border-left: 8px solid #d0e5f2;
            padding: 5px 10px;
            margin: 10px 0;
            line-height: 1.4;
            font-size: 100%;
            background-color: #f1f1f1;
        }

        /* code 样式 */
        code {
            display: inline-block;
            *display: inline;
            *zoom: 1;
            background-color: #f1f1f1;
            border-radius: 3px;
            padding: 3px 5px;
            margin: 0 3px;
        }
        pre code {
            display: block;
        }
        /* ul ol 样式 */
        ul, ol {
            margin: 10px 0 10px 20px;
        }
    </style>
</head>
<div id="updateDialog" class="crudDialog">
    <form method="post" id="updateForm">
        <input type="hidden" name="userId" value="1">
        <div class="row">
            <div class="col-sm-5">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="dayongName">景点名称</label>
                        <input id="dayongName" type="text" class="form-control" name="dayongName" maxlength="200" value="${spot.dayongName}">
                    </div>
                </div>
            </div>
            <div class="col-sm-5 col-sm-offset-1">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="dayongEnname">英文名称</label>
                        <input id="dayongEnname" type="text" class="form-control" name="dayongEnname" maxlength="200" value="${spot.dayongEnname}">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-5">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="address">地址</label>
                        <input type="text" id="address" class="form-control" name="address" maxlength="200" value="${spot.address}">
                    </div>
                </div>
            </div>
            <div class="col-sm-5 col-sm-offset-1">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="route">乘车路线</label>
                        <input type="text" id="route" class="form-control" name="route" maxlength="200" value="${spot.route}">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-5">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="catelog">分类</label>
                        <input type="text" id="catelog" class="form-control" name="catelog" maxlength="200" value="${spot.catelog}">
                    </div>
                </div>
            </div>
            <div class="col-sm-5 col-sm-offset-1">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="keyword">关键字（用英文，隔开）</label>
                        <input type="text" id="keyword" class="form-control" name="keyword" maxlength="200" value="${spot.keyword}">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="summary">摘要</label>
                        <input type="text" id="summary" class="form-control" name="summary" maxlength="200" value="${spot.summary}">
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-12">
                <div class="form-group">
                    <div class="fg-line">
                        <label for="dayongDesc">详情描述</label>
                        <textarea id="dayongDesc" name="dayongDesc" class="form-control" style="visibility: hidden" rows="1"></textarea>
                        <%--<input type="text" id="dayongDesc" class="form-control" name="dayongDesc">--%>
                        <div id="div1" >

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="form-group text-right dialog-buttons">
            <a class="waves-effect waves-button" href="javascript:;" onclick="updateSubmit();">保存</a>
            <a class="waves-effect waves-button" href="javascript:;" onclick="updateDialog.close();">取消</a>
        </div>
    </form>
</div>
<script>
    var E = window.wangEditor
    var editor = new E('#div1')
    var $text1 = $('#dayongDesc')
    var $txt1 = '${spot.dayongDesc}'
    $('#div1').html($txt1)
    editor.customConfig.onchange = function (html) {
        // 监控变化，同步更新到 textarea
        $text1.val(html)
    }
    editor.create()
    // 初始化 textarea 的值
    $('#dayongDesc').val($txt1)

    function updateSubmit() {
        $.ajax({
            type: 'post',
            url: '${basePath}/manage/spot/update/${spot.dayongId}',
            data: $('#updateForm').serialize(),
            beforeSend: function() {
                if ($('#title').val() == '') {
                    $('#title').focus();
                    return false;
                }
            },
            success: function(result) {
                if (result.code != 1) {
                    if (result.data instanceof Array) {
                        $.each(result.data, function(index, value) {
                            $.confirm({
                                theme: 'dark',
                                animation: 'rotateX',
                                closeAnimation: 'rotateX',
                                title: false,
                                content: value.errorMsg,
                                buttons: {
                                    confirm: {
                                        text: '确认',
                                        btnClass: 'waves-effect waves-button waves-light'
                                    }
                                }
                            });
                        });
                    } else {
                        $.confirm({
                            theme: 'dark',
                            animation: 'rotateX',
                            closeAnimation: 'rotateX',
                            title: false,
                            content: result.data.errorMsg,
                            buttons: {
                                confirm: {
                                    text: '确认',
                                    btnClass: 'waves-effect waves-button waves-light'
                                }
                            }
                        });
                    }
                } else {
                    updateDialog.close();
                    $table.bootstrapTable('refresh');
                }
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) {
                $.confirm({
                    theme: 'dark',
                    animation: 'rotateX',
                    closeAnimation: 'rotateX',
                    title: false,
                    content: textStatus,
                    buttons: {
                        confirm: {
                            text: '确认',
                            btnClass: 'waves-effect waves-button waves-light'
                        }
                    }
                });
            }
        });
    }
</script>