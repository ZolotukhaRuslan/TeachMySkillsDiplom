
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <title><tiles:getAsString name="title" /></title>
</head>

<body>
<table width="100%">


    <tr>

        <td width="80%">
            <tiles:insertAttribute name="body" />
        </td>

</table>
</body>
</html>