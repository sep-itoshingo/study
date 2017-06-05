<#ftl output_format="HTML" /> 

<#macro echoHW temp>
<span>Hello World!! ${temp} </span>
</#macro>

<#function isEmpty arg>
    <#return (arg?has_content)?then(1, 0) />
</#function>