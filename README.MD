# All About That CSV
## Version 0.1
## Target
A utility for every possible need related to csv
## Manual & API
API:
```
// API class:
AboutCSV aboutCSV = new AboutCSV();

// generate random CSV API:
aboutCSV.genCSV().genAddressBook_toRaw(numOfEntries, targetFilePath);
                 .genAddressBook_toCompact(numOfEntries, targetFilePath);
                 .genHarryPotter_toRaw(numOfEntries, targetFilePath);
                 .genHarryPotter_toCompact(numOfEntries, targetFilePath);

// read and print CSV API:
aboutCSV.readCSV().printCSV_toRaw(targetFilePath);
                  .printCSV_toCompact(targetFilePath);
                  .printCSV_toTabulated(targetFilePath);

// convert CSV API:
aboutCSV.convertCSV().convertCSV_toCompact(fromFilePath, toFilePath);
                     .convertCSV_toTabulated(fromFilePath, toFilePath);
```
Format Example:
```
Compact:
Print CSV as Raw Format Done
Print CSV to Compact Format from: /Users/jibinzou/Documents/all-about-that-csv/files/input/testCSVFile1.csv
-------------start---------------
firstName,lastName,phoneNumber,streetName,city,state,zipCode,country
Davis,Glover,641-359-3720,Ronald Burgs,Port Rudolfstad,Alaska,19977-2116,Libyan Arab Jamahiriya
Ivonne,Orn,562.382.6524,Heike Crossroad,Swaniawskimouth,Wisconsin,90639-8043,Tajikistan
Manual,,(602) 714-2617 x086,Muller Summit,Port Trevor,West Virginia,06273-1121,Luxembourg
Arturo,1-510-741-1469 x521,Imogene Extensions,East Chong,Rhode Island,85554,Italy
Alta,Stehr,470.327.7810,Tremblay Isle,Littelhaven,Nevada,87590,Barbados
Mariel,Fay,1-791-865-6426 x194,Kari Trace,East Dominickburgh,North Carolina,89708,Yemen
Kenneth,Wiegand,267.508.0326 x56546,Upton Ports,East Estela,Maine,55551-0451,Jersey
Rheba,Cruickshank,(645) 181-9617 x04329,Guadalupe Forges,South Jerilyntown,Michigan,28790,San Marino
Kendall,Stiedemann,837.645.6997 x11053,Oren Mission,Port Easter,South Dakota,08358,Senegal
Angella,Leffler,888-744-5550,Macejkovic Crest,Pollichborough,Kentucky,40845,Bosnia and Herzegovina
--------------end----------------
Print CSV to Compact Format Done

Tabulated:
Print CSV to Tabulated Format from: /Users/jibinzou/Documents/all-about-that-csv/files/input/testCSVFile1.csv
-------------start---------------
 firstName , lastName            , phoneNumber           , streetName       , city               , state          , zipCode    , country                
 Davis     , Glover              , 641-359-3720          , Ronald Burgs     , Port Rudolfstad    , Alaska         , 19977-2116 , Libyan Arab Jamahiriya 
 Ivonne    , Orn                 , 562.382.6524          , Heike Crossroad  , Swaniawskimouth    , Wisconsin      , 90639-8043 , Tajikistan             
 Manual    ,                     , (602) 714-2617 x086   , Muller Summit    , Port Trevor        , West Virginia  , 06273-1121 , Luxembourg             
 Arturo    , 1-510-741-1469 x521 , Imogene Extensions    , East Chong       , Rhode Island       , 85554          , Italy      ,                        
 Alta      , Stehr               , 470.327.7810          , Tremblay Isle    , Littelhaven        , Nevada         , 87590      , Barbados               
 Mariel    , Fay                 , 1-791-865-6426 x194   , Kari Trace       , East Dominickburgh , North Carolina , 89708      , Yemen                  
 Kenneth   , Wiegand             , 267.508.0326 x56546   , Upton Ports      , East Estela        , Maine          , 55551-0451 , Jersey                 
 Rheba     , Cruickshank         , (645) 181-9617 x04329 , Guadalupe Forges , South Jerilyntown  , Michigan       , 28790      , San Marino             
 Kendall   , Stiedemann          , 837.645.6997 x11053   , Oren Mission     , Port Easter        , South Dakota   , 08358      , Senegal                
 Angella   , Leffler             , 888-744-5550          , Macejkovic Crest , Pollichborough     , Kentucky       , 40845      , Bosnia and Herzegovina 
--------------end----------------
Print CSV to Tabulated Format Done
```
## Coding Style
General Java Coding style
## Author
redlogo
## Copyright
Copyright © 2019 - 2020 redlogo