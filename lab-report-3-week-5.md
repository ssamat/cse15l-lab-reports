# Lab Report 3

# Find Commands

**Size Code**
Using -size allows you to find files that the files that fit the range of sizes in which you set them to in the terminal. This will help you narrow the file size you are looking for.
```
$ find ./technical/911report -size +1k -size -100k

./technical/911report/chapter-13.1.txt
./technical/911report/chapter-2.txt
./technical/911report/chapter-5.txt
./technical/911report/chapter-8.txt
./technical/911report/preface.txt
./technical/911report/chapter-10.txt
./technical/911report/chapter-11.txt
```
```
$ find ./technical/911report -size +1k -size -10k

./technical/911report/preface.txt
```
```
$ find ./technical/government -size +1k -size -2k

./technical/government/Media/Helping_Hands.txt
./technical/government/Media/Campaign_Pays.txt
./technical/government/Media/Fire_Victims_Sue.txt
./technical/government/Media/Court_Keeps_Judge_From.txt
./technical/government/Media/It_Pays_to_Know.txt
./technical/government/Media/Self-Help_Website.txt
./technical/government/Media/Justice_requests.txt
./technical/government/Media/Wilmington_lawyer.txt
./technical/government/Media/Lawyer_Web_Survey.txt
```

**Name Code**
Using -name allows you to find the name of all the files in which you want to get.
```
$ find ./technical/911report -name preface.txt

./technical/911report/preface.txt
```

```
$ find ./technical/biomed -name 1468*.txt

./technical/biomed/1468-6708-3-10.txt
./technical/biomed/1468-6708-3-4.txt
./technical/biomed/1468-6708-3-7.txt
./technical/biomed/1468-6708-3-3.txt
./technical/biomed/1468-6708-3-1.txt
![Image](nameThree.png)
```

```
$ find ./technical -name bill.txt

./technical/government/Env_Prot_Agen/bill.txt
```

**IName Code**
Using -iname allows you to find the name of all the files in which you want to get, however it is not case-specific. This means it will return all files lowercase and uppercase. As you can see in the first example, both trials with s and S returned the same results
```
find ./technical -iname "S*.txt"

./technical/government/About_LSC/Strategic_report.txt
./technical/government/About_LSC/Special_report_to_congress.txt
./technical/government/About_LSC/State_Planning_Report.txt
./technical/government/About_LSC/State_Planning_Special_Report.txt
./technical/government/Env_Prot_Agen/section-by-section_summary.txt
./technical/government/Alcohol_Problems/Session2-PDF.txt
./technical/government/Alcohol_Problems/Session3-PDF.txt
./technical/government/Alcohol_Problems/Session4-PDF.txt
./technical/government/Gen_Account_Office/Sept27-2002_d02966.txt
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt
./technical/government/Gen_Account_Office/Sept14-2002_d011070.txt
./technical/government/Media/State_funding.txt
./technical/government/Media/Supporting_Legal_Center.txt
./technical/government/Media/Survey.txt
./technical/government/Media/Self-Help_Website.txt
./technical/government/Media/Service_Agency.txt

find ./technical -iname "s*.txt"

./technical/government/About_LSC/Strategic_report.txt
./technical/government/About_LSC/Special_report_to_congress.txt
./technical/government/About_LSC/State_Planning_Report.txt
./technical/government/About_LSC/State_Planning_Special_Report.txt
./technical/government/Env_Prot_Agen/section-by-section_summary.txt
./technical/government/Alcohol_Problems/Session2-PDF.txt
./technical/government/Alcohol_Problems/Session3-PDF.txt
./technical/government/Alcohol_Problems/Session4-PDF.txt
./technical/government/Gen_Account_Office/Sept27-2002_d02966.txt
./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt
./technical/government/Gen_Account_Office/Sept14-2002_d011070.txt
./technical/government/Media/State_funding.txt
./technical/government/Media/Supporting_Legal_Center.txt
./technical/government/Media/Survey.txt
./technical/government/Media/Self-Help_Website.txt
./technical/government/Media/Service_Agency.txt
```

```
$ find ./technical -iname "P*.txt"
./technical/government/About_LSC/Progress_report.txt
./technical/government/About_LSC/Protocol_Regarding_Access.txt
./technical/government/Gen_Account_Office/pe1019.txt
./technical/government/Gen_Account_Office/Paper_Walker11-2002_acpro122.txt
./technical/government/Media/Providing_Legal_Aid.txt
./technical/government/Media/Poor_Lacking_Legal_Aid.txt
./technical/government/Media/Paralegal_Honored.txt
./technical/government/Media/Philly_Lawyers.txt
./technical/government/Media/Pro_Bono_Services.txt
./technical/government/Media/predatory_loans.txt
./technical/government/Media/Poverty_Lawyers.txt
./technical/government/Media/Program_Lodges.txt
./technical/government/Media/Politician_Practices.txt
./technical/government/Media/Pro-bono_road_show.txt
./technical/government/Media/pro_bono_efforts.txt
./technical/plos/pmed.0020273.txt
./technical/plos/pmed.0020065.txt
./technical/plos/pmed.0020071.txt
./technical/plos/pmed.0020059.txt
./technical/plos/pmed.0010039.txt
./technical/plos/pmed.0010010.txt
./technical/plos/pmed.0020104.txt
./technical/plos/pmed.0020272.txt
./technical/plos/pmed.0020258.txt
./technical/plos/pmed.0020099.txt
./technical/plos/pmed.0010013.txt
./technical/plos/pmed.0020113.txt
./technical/plos/pmed.0020098.txt
./technical/plos/pmed.0020067.txt
./technical/plos/pmed.0020073.txt
./technical/plos/pmed.0020249.txt
./technical/plos/pmed.0020275.txt
./technical/plos/pmed.0020088.txt
./technical/plos/pmed.0020103.txt
./technical/plos/pmed.0020117.txt
./technical/plos/pmed.0020116.txt
./technical/plos/pmed.0020102.txt
./technical/plos/pmed.0020062.txt
./technical/plos/pmed.0020274.txt
./technical/plos/pmed.0020048.txt
./technical/plos/pmed.0020060.txt
./technical/plos/pmed.0020074.txt
./technical/plos/pmed.0020114.txt
./technical/plos/pmed.0010028.txt
./technical/plos/pmed.0010029.txt
./technical/plos/pmed.0020115.txt
./technical/plos/pmed.0020075.txt
./technical/plos/pmed.0020061.txt
./technical/plos/pmed.0020210.txt
./technical/plos/pmed.0020238.txt
./technical/plos/pmed.0010066.txt
./technical/plos/pmed.0020198.txt
./technical/plos/pmed.0010067.txt
./technical/plos/pmed.0020007.txt
./technical/plos/pmed.0020239.txt
./technical/plos/pmed.0020005.txt
./technical/plos/pmed.0020039.txt
./technical/plos/pmed.0010071.txt
./technical/plos/pmed.0010058.txt
./technical/plos/pmed.0010070.txt
./technical/plos/pmed.0010064.txt
./technical/plos/pmed.0020158.txt
./technical/plos/pmed.0020206.txt
./technical/plos/pmed.0020212.txt
./technical/plos/pmed.0020216.txt
./technical/plos/pmed.0020028.txt
./technical/plos/pmed.0020148.txt
./technical/plos/pmed.0020160.txt
./technical/plos/pmed.0010048.txt
./technical/plos/pmed.0010060.txt
./technical/plos/pmed.0010061.txt
./technical/plos/pmed.0010049.txt
./technical/plos/pmed.0020161.txt
./technical/plos/pmed.0020149.txt
./technical/plos/pmed.0020015.txt
./technical/plos/pmed.0020203.txt
./technical/plos/pmed.0020201.txt
./technical/plos/pmed.0020017.txt
./technical/plos/pmed.0010062.txt
./technical/plos/pmed.0020189.txt
./technical/plos/pmed.0020162.txt
./technical/plos/pmed.0020016.txt
./technical/plos/pmed.0020002.txt
./technical/plos/pmed.0020200.txt
./technical/plos/pmed.0020231.txt
./technical/plos/pmed.0020027.txt
./technical/plos/pmed.0020033.txt
./technical/plos/pmed.0010047.txt
./technical/plos/pmed.0010046.txt
./technical/plos/pmed.0010052.txt
./technical/plos/pmed.0020191.txt
./technical/plos/pmed.0020146.txt
./technical/plos/pmed.0020232.txt
./technical/plos/pmed.0020226.txt
./technical/plos/pmed.0020024.txt
./technical/plos/pmed.0020018.txt
./technical/plos/pmed.0020144.txt
./technical/plos/pmed.0020150.txt
./technical/plos/pmed.0020187.txt
./technical/plos/pmed.0010050.txt
./technical/plos/pmed.0010051.txt
./technical/plos/pmed.0020192.txt
./technical/plos/pmed.0010045.txt
./technical/plos/pmed.0020145.txt
./technical/plos/pmed.0020019.txt
./technical/plos/pmed.0020237.txt
./technical/plos/pmed.0020009.txt
./technical/plos/pmed.0020035.txt
./technical/plos/pmed.0020021.txt
./technical/plos/pmed.0020155.txt
./technical/plos/pmed.0010069.txt
./technical/plos/pmed.0010041.txt
./technical/plos/pmed.0020182.txt
./technical/plos/pmed.0020196.txt
./technical/plos/pmed.0020197.txt
./technical/plos/pmed.0010068.txt
./technical/plos/pmed.0020140.txt
./technical/plos/pmed.0020020.txt
./technical/plos/pmed.0020034.txt
./technical/plos/pmed.0020236.txt
./technical/plos/pmed.0020208.txt
./technical/plos/pmed.0020022.txt
./technical/plos/pmed.0020036.txt
./technical/plos/pmed.0010056.txt
./technical/plos/pmed.0020195.txt
./technical/plos/pmed.0010042.txt
./technical/plos/pmed.0020181.txt
./technical/plos/pmed.0020180.txt
./technical/plos/pmed.0020194.txt
./technical/plos/pmed.0020157.txt
./technical/plos/pmed.0020023.txt
./technical/plos/pmed.0020235.txt
./technical/plos/pmed.0020209.txt
./technical/plos/pmed.0020246.txt
./technical/plos/pmed.0020050.txt
./technical/plos/pmed.0020118.txt
./technical/plos/pmed.0010030.txt
./technical/plos/pmed.0010024.txt
./technical/plos/pmed.0010025.txt
./technical/plos/pmed.0020086.txt
./technical/plos/pmed.0020045.txt
./technical/plos/pmed.0020247.txt
./technical/plos/pmed.0020047.txt
./technical/plos/pmed.0020090.txt
./technical/plos/pmed.0010026.txt
./technical/plos/pmed.0020085.txt
./technical/plos/pmed.0020091.txt
./technical/plos/pmed.0020278.txt
./technical/plos/pmed.0020268.txt
./technical/plos/pmed.0010022.txt
./technical/plos/pmed.0010036.txt
./technical/plos/pmed.0010023.txt
./technical/plos/pmed.0020123.txt
./technical/plos/pmed.0020094.txt
./technical/plos/pmed.0020257.txt
./technical/plos/pmed.0020055.txt
./technical/plos/pmed.0020082.txt
./technical/plos/pmed.0010021.txt
./technical/plos/pmed.0010034.txt
./technical/plos/pmed.0010008.txt
./technical/plos/pmed.0020120.txt
./technical/plos/pmed.0020040.txt
./technical/plos/pmed.0020068.txt
./technical/plos/pmed.0020281.txt
./technical/plos/pmed.0020242.txt
./technical/911report/preface.txt
```
```
$ find ./technical -iname "c*.txt"
./technical/government/About_LSC/Comments_on_semiannual.txt
./technical/government/About_LSC/CONFIG_STANDARDS.txt
./technical/government/About_LSC/commission_report.txt
./technical/government/About_LSC/conference_highlights.txt
./technical/government/Env_Prot_Agen/ctf7-10.txt
./technical/government/Env_Prot_Agen/ctf1-6.txt
./technical/government/Env_Prot_Agen/ctm4-10.txt
./technical/government/Post_Rate_Comm/Cohenetal_CreamSkimming.txt
./technical/government/Post_Rate_Comm/Cohenetal_DeliveryCost.txt
./technical/government/Post_Rate_Comm/Cohenetal_Cost_Function.txt
./technical/government/Post_Rate_Comm/Cohenetal_comparison.txt
./technical/government/Post_Rate_Comm/Cohenetal_Scale.txt
./technical/government/Post_Rate_Comm/Cohenetal_RuralDelivery.txt
./technical/government/Media/City_Council_Budget.txt
./technical/government/Media/Campaign_Pays.txt
./technical/government/Media/Court_Keeps_Judge_From.txt
./technical/government/Media/Coup_Reshapes_Legal_Aid.txt
./technical/government/Media/Commercial_Appeal.txt
./technical/government/Media/Civil_Matters.txt
./technical/government/Media/Crains_New_York_Business.txt
./technical/government/Media/CommercialAppealMemphis2.txt
./technical/biomed/cc991.txt
./technical/biomed/cc4.txt
./technical/biomed/cc367.txt
./technical/biomed/cc3.txt
./technical/biomed/cc2190.txt
./technical/biomed/cc1843.txt
./technical/biomed/cc1856.txt
./technical/biomed/cc105.txt
./technical/biomed/cc1498.txt
./technical/biomed/cc1538.txt
./technical/biomed/cc1882.txt
./technical/biomed/cc300.txt
./technical/biomed/cc1529.txt
./technical/biomed/cc103.txt
./technical/biomed/cc303.txt
./technical/biomed/cc1477.txt
./technical/biomed/cc1852.txt
./technical/biomed/cc713.txt
./technical/biomed/cc1476.txt
./technical/biomed/cc2172.txt
./technical/biomed/cc2358.txt
./technical/biomed/cc2167.txt
./technical/biomed/cc2171.txt
./technical/biomed/cc2160.txt
./technical/biomed/cc1044.txt
./technical/biomed/cc1497.txt
./technical/biomed/cc1495.txt
./technical/biomed/cc350.txt
./technical/biomed/cc973.txt
./technical/biomed/cvm-2-1-038.txt
./technical/biomed/cvm-2-6-278.txt
./technical/biomed/cvm-2-4-180.txt
./technical/biomed/cc1547.txt
./technical/biomed/cvm-2-6-286.txt
./technical/biomed/cc343.txt
./technical/biomed/cvm-2-4-187.txt
./technical/911report/chapter-13.4.txt
./technical/911report/chapter-13.5.txt
./technical/911report/chapter-13.1.txt
./technical/911report/chapter-13.2.txt
./technical/911report/chapter-13.3.txt
./technical/911report/chapter-3.txt
./technical/911report/chapter-2.txt
./technical/911report/chapter-1.txt
./technical/911report/chapter-5.txt
./technical/911report/chapter-6.txt
./technical/911report/chapter-7.txt
./technical/911report/chapter-9.txt
./technical/911report/chapter-8.txt
./technical/911report/chapter-12.txt
./technical/911report/chapter-10.txt
./technical/911report/chapter-11.txt
```
