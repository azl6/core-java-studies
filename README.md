## REGEX detalhado

![Screenshot from 2022-11-20 20-34-11](https://user-images.githubusercontent.com/80921933/202932602-c3c0ad88-7fed-44de-9577-455c0abc59b2.png)

- [\<char1>\<char2>...] - Localiza **OU** \<char1> **OU** \<char2>

  Exemplos:
  
  [01] - Localiza 0 ou 1
  
- [\<char1>]{\<num_ocorrências>} - Localiza uma sequência de <num_ocorrências> de \<char1>

  Exemplos:
  
  [0]{3} - Localiza 000 <br>
  [0-9]{6} - Localiza 6 digitos em sequência <br>
  [0-9]{6}$ - Localiza os 6 últimos digitos, já que o $ representa o fim da linha <br>
  \^[0-9]{6}$ - Localiza strings com exatamente 6 dígitos, já que o ^ representa o começo da linha <br>
  \^[0-9]+$ - Localiza uma string com infinitas ocorrências de dígitos, ex: 111, 11111, 11111111.... etc... <br>
  
Podemos "quebrar" o regex em argumentos, abraçando cada argumento com (<argumento>). Desta forma, no VSCode, podemos utilizá-lo posteriormente para substituições, como segue o exemplo abaixo:

![Screenshot from 2022-11-25 13-45-48](https://user-images.githubusercontent.com/80921933/204028148-d9cbbb78-38da-4b8f-a606-6c0c5c258e94.png)


## Criação de um .xlsx baixável

```java
@GetMapping("/export")
  @ApiOperation(value = "Exporta um ODS ou XLSX com base nos parametros informados")
  public void exportConvenios(@RequestParam String entidade,
                              @RequestParam String departamento,
                              @RequestParam Integer ano,
                              @RequestParam TipoExportacaoEnum tipoExportacaoEnum,
                              HttpServletResponse response

  ){

    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("fileName");
    setResponseProperties(response);
    download(response, workbook);
    
  }

  private void setResponseProperties(HttpServletResponse response) {
    response.setHeader("Content-Disposition", "attachment;filename=Convenios.xlsx;Accept: */*");
    response.setContentType("application/octet-stream");
  }

  private void download(HttpServletResponse response, Workbook workbook){
    try (ServletOutputStream outputStream = response.getOutputStream()) {
        workbook.write(outputStream);
        workbook.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```
