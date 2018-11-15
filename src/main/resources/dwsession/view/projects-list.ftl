<!doctype html>
<html>
<head>
<#include "head.ftl">
<title>Projetos</title>
</head>
<body>
<#include "navbar.ftl">


<div class="container-fluid">
	<div class="row">
		
		<#include "sidebar.ftl">

    <main class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4" role="main">
        <#include "project-description.ftl">

        <div class="row">
            <div class="col">
                <h3>Datasets</h3>
                <#include "table.ftl">
            </div>
            <div class="col">
                <h3>Datasets</h3>
                <#include "table.ftl">
            </div>
        </div>
    </main>
	</div>	
</div>


<#include "footer.ftl">
</body>
</html>

