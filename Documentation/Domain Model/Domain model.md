
<table align="center" width="810" height="644" ">
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center"><strong>Archiving</strong></p>
          <p align="center"> UC-2  :Responsibility</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Responsibility Description</p></td>
        <td width="48" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept name</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Coordinate    actions of concepts associated with this use case and delegate the work to    other concepts.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>HTML    document that displays what actions can be done.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>A    form specifying the new record details.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Archive    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Queries    the database to store the new record and its details. </p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Archiver</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>A    query to the database to create a new record in the database.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database    Connection</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Notify    user about the result of the process</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Notifier</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-2 Association - Archiving</p></td>
      </tr>
      <tr>
        <td width="216" valign="top"><p>Concept pair</p></td>
        <td width="294" valign="top"><p>Association description</p></td>
        <td width="114" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="216"><p>Archive    Page ↔ Controller</p></td>
        <td width="294" valign="top"><p>Archive    Page passes the new record parameters to the Controller</p></td>
        <td width="114"><p>Conveys    Request</p></td>
      </tr>
      <tr>
        <td width="216"><p>Controller    ↔ Archiver</p></td>
        <td width="294" valign="top"><p>Controller    passes the new record parameters to the Archiver</p></td>
        <td width="114"><p>Conveys    Request</p></td>
      </tr>
      <tr>
        <td width="216"><p>Archiver    ↔ Database Connection</p></td>
        <td width="294" valign="top"><p>Archiver    passes the queries to the Database Connection. </p></td>
        <td width="114"><p>Requests    Query</p></td>
      </tr>
      <tr>
        <td width="216"><p>Database    Connection  ↔ Notifier</p></td>
        <td width="294" valign="top"><p>Database    connection informs the notifier about the result of process of record    creation</p></td>
        <td width="114"><p>Informs</p></td>
      </tr>
      <tr>
        <td width="216"><p>Notifier    ↔ Interface Page</p></td>
        <td width="294" valign="top"><p>Notifier    passes the process result message to the Interface page to display.</p></td>
        <td width="114"><p>Displays</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-2 Attributes - Archiving</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Concept</p></td>
        <td width="120" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Archiver</p></td>
        <td width="120" valign="top"><p>Record parameters</p></td>
        <td width="369" valign="top"><p>Name, Category, ID, Date (publish, archive, recording), tag</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><img src="img/UC-2 Archiving.bmp" width="640" height="469"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center"><strong>Search</strong></p>
          <p align="center">UC-3 Responsibility</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Responsibility Description</p></td>
        <td width="48" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept name</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Coordinate    actions of concepts associated with this use case and delegate the work to    other concepts.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>HTML    document that displays what actions can be done.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Form    specifying the Search parameters for data retrieval from the database.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Search    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Retrieves    the records from the database.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Searcher</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Render    the retrieved records into an HTML document for sending to actor&rsquo;s Web    browser for display.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Page    Maker</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>A    query to the database that matches the actor&rsquo;s search criteria and retrieve    the records.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database    Connection</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>The    selected record can be previewed to the user.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Media    Player</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>The    selected record can be downloaded by the user.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Media    Downloader</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left" width="630">
      <tr>
        <td width="630" colspan="3" valign="top"><p align="center">UC-3 Association</p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Concept pair</p></td>
        <td width="342" valign="top"><p>Association description</p></td>
        <td width="132" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Controller ↔ Interface Page</p></td>
        <td width="342" valign="top"><p>Controller prepares the interface page to be displayed for the user.    And receives the search parameters.</p></td>
        <td width="132" valign="top"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Controller ↔ Search Request</p></td>
        <td width="342" valign="top"><p>Controller passes the search parameters to the Search Request.</p></td>
        <td width="132" valign="top"><p>Conveys Request</p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Search Request ↔ Database Connection</p></td>
        <td width="342" valign="top"><p>Search request asks the database connection to retrieve the matching    records from the database.</p></td>
        <td width="132" valign="top"><p>Retrieves Records</p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Database Connection ↔ Page Maker</p></td>
        <td width="342" valign="top"><p>Database Connection passes the retrieved data to Page Maker to render    them for display</p></td>
        <td width="132" valign="top"><p>Provides Data</p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Page Maker ↔ Interface Page</p></td>
        <td width="342" valign="top"><p>Page Maker prepares the Interface Page to display the list of    retrieved records for the user</p></td>
        <td width="132" valign="top"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Interface Page ↔ Controller</p></td>
        <td width="342" valign="top"><p>Interface Page conveys play request to the Controller</p></td>
        <td width="132" valign="top"><p>Requests Play</p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Controller ↔ Media Player</p></td>
        <td width="342" valign="top"><p>Controller conveys the record to be displayed by Media Player, if    selected</p></td>
        <td width="132" valign="top"><p>Conveys Data</p></td>
      </tr>
      <tr>
        <td width="156" valign="top"><p>Controller ↔  Media Downloader</p></td>
        <td width="342" valign="top"><p>Controller conveys the record to be downloaded to the user specified    location, if selected</p></td>
        <td width="132" valign="top"><p>Conveys Data</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-3 Attributes</p></td>
      </tr>
      <tr>
        <td width="144" valign="top"><p>Concept</p></td>
        <td width="138" valign="top"><p>Attributes</p></td>
        <td width="342" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="144" valign="top"><p>Search Request</p></td>
        <td width="138" valign="top"><p>Search parameters</p></td>
        <td width="342" valign="top"><p>General, Specified Date, Tag, Category and Name</p></td>
      </tr>
      <tr>
        <td width="144" valign="top"><p>Media Player</p></td>
        <td width="138" valign="top"><p>File path</p></td>
        <td width="342" valign="top"><p>Used to specify the location of the file.</p></td>
      </tr>
      <tr>
        <td width="144" valign="top"><p>Media Downloader</p></td>
        <td width="138" valign="top"><p>File path</p></td>
        <td width="342" valign="top"><p>Used to specify the location of the file.</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><img src="img/UC-3 Search.bmp" width="630" height="388"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center"><strong>Report</strong></p>
          <p align="center">UC-4 Responbisility</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Responsibility Description</p></td>
        <td width="48" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept name</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Coordinate    actions of concepts associated with this use case and delegate the work to    other concepts.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>HTML    document that displays what actions can be done.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Form    specifying the filter parameters for data retrieval from the database.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Report    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>To    perform the filter request according to the user specified criteria</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Filter    Request</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Render    the retrieved records into an HTML document for sending to actor&rsquo;s Web    browser for display.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Page    Maker</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>A    query to the database that matches the actor&rsquo;s search criteria and retrieve    the records.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database    Connection</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Schedules    the records to be printed, if requested.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Printer    Connection</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-4 Association</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Concept pair</p></td>
        <td width="276" valign="top"><p>Association description</p></td>
        <td width="126" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller ↔ Interface Page</p></td>
        <td width="276" valign="top"><p>Controller prepares the interface page to be displayed for the user.    And receives the filter parameters.</p></td>
        <td width="126" valign="top"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller ↔ Filter Request</p></td>
        <td width="276" valign="top"><p>Controller passes the filter parameters to the Filter Request.</p></td>
        <td width="126" valign="top"><p>Conveys Request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Filter Request ↔ Database Connection</p></td>
        <td width="276" valign="top"><p>Filter request asks the database connection to retrieve the matching    records from the database.</p></td>
        <td width="126" valign="top"><p>Retrieves Records</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Database Connection ↔ Page Maker</p></td>
        <td width="276" valign="top"><p>Database Connection passes the retrieved data to Page Maker to render    them for display</p></td>
        <td width="126" valign="top"><p>Provides Data</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Page Maker ↔ Interface Page</p></td>
        <td width="276" valign="top"><p>Page Maker prepares the Interface Page to display the list of    retrieved records</p></td>
        <td width="126" valign="top"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller ↔ Printer Connection</p></td>
        <td width="276" valign="top"><p>Controller requests printer to print the report.</p></td>
        <td width="126" valign="top"><p>Requests Print</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Database Connection ↔  Printer    Connection</p></td>
        <td width="276" valign="top"><p>Database Connection provides the data for the Printer Connection</p></td>
        <td width="126" valign="top"><p>Provides Data</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-4 Attributes</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Concept</p></td>
        <td width="120" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Filter    Request</p></td>
        <td width="120" valign="top"><p>Filter    parameters</p></td>
        <td width="369" valign="top"><p>General,    Specified Date, Tag, Category and Name</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><img src="img/UC-4 Report.bmp" width="660" height="556"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center"><strong>Automatic Backup</strong></p>
          <p align="center">UC-5 Responsibility</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Responsibility Description</p></td>
        <td width="48" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept name</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Coordinate    actions of concepts associated with this use case and delegate the work to    other concepts.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>To    start the backup automatically, according to the schedule, to a specified    location in the system.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Scheduler</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Requests    the backup query to the database</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Backup    Creator</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>A    query to the database that matches the user&rsquo;s backup criteria and retrieve    the records.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database    Connection</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Notifies    the result of the process to the user</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Notifier</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>HTML    document that displays what actions can be done.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface    Page</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-5 Association</p></td>
      </tr>
      <tr>
        <td width="216" valign="top"><p>Concept pair</p></td>
        <td width="294" valign="top"><p>Association description</p></td>
        <td width="114" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="216"><p>Scheduler    ↔ Controller</p></td>
        <td width="294" valign="top"><p>Scheduler    invokes the Controller to start the backup process.</p></td>
        <td width="114"><p>Invokes</p></td>
      </tr>
      <tr>
        <td width="216"><p>Controller    ↔ Backup Creator</p></td>
        <td width="294" valign="top"><p>Controller    passes the request to the Backup Creator.</p></td>
        <td width="114"><p>Conveys    Request</p></td>
      </tr>
      <tr>
        <td width="216"><p>Backup    Creator ↔ Database Connection</p></td>
        <td width="294" valign="top"><p>Backup    Creator request query from the Database Connection. </p></td>
        <td width="114"><p>Requests    Query</p></td>
      </tr>
      <tr>
        <td width="216"><p>Database    Connection ↔ Notifier</p></td>
        <td width="294" valign="top"><p>Once    the backup process is completed, the Database Connection informs the notifier</p></td>
        <td width="114"><p>Informs</p></td>
      </tr>
      <tr>
        <td width="216"><p>Notifier    ↔ Interface Page</p></td>
        <td width="294" valign="top"><p>Notifier    passes a process completion message to the Interface page to display.</p></td>
        <td width="114"><p>Notifies</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-5 Attributes</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Concept</p></td>
        <td width="120" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Backup Creator</p></td>
        <td width="120" valign="top"><p>Backup parameters</p></td>
        <td width="369" valign="top"><p>From date, To date</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><img src="img/UC5 AutoBackup.bmp" width="638" height="487"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center"><strong>Manual Backup</strong></p>
          <p align="center">UC-6 Responsibility</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Responsibility Description</p></td>
        <td width="48" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept name</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Coordinate    actions of concepts associated with this use case and delegate the work to    other concepts.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>HTML    document that displays what actions can be done.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>A    form specifying the manual backup parameters.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Manual    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>To    perform the backup action according to the user specified date.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Manual    Backup</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>A    query to the database that matches the actor&rsquo;s backup criteria and retrieve    the records.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database    Connection</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Notify    user about the result of the backup</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Notifier</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-6 Association</p></td>
      </tr>
      <tr>
        <td width="216" valign="top"><p>Concept pair</p></td>
        <td width="294" valign="top"><p>Association description</p></td>
        <td width="114" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="216"><p>Controller    ↔ Interface Page</p></td>
        <td width="294" valign="top"><p>Controller    prepares the interface page to be displayed for the user.</p></td>
        <td width="114"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="216"><p>Controller    ↔ Manual Backup</p></td>
        <td width="294" valign="top"><p>Controller    passes the user&rsquo;s selected date value to the Manual Backup</p></td>
        <td width="114"><p>Conveys    Request</p></td>
      </tr>
      <tr>
        <td width="216"><p>Manual    Backup ↔ Database Connection</p></td>
        <td width="294" valign="top"><p>Manual    Backup passes the criteria to the Database Connection. Database Connection    retrieves the records and passes to the Manual Backup.</p></td>
        <td width="114"><p>Retrives    Data</p></td>
      </tr>
      <tr>
        <td width="216"><p>Manual    Backup ↔ Notifier</p></td>
        <td width="294" valign="top"><p>Once    the backup process is completed, the Manual Backup notifies the Notifier    about the completion.</p></td>
        <td width="114"><p>Notifies</p></td>
      </tr>
      <tr>
        <td width="216"><p>Notifier    ↔ Interface Page</p></td>
        <td width="294" valign="top"><p>Notifier    passes a process completion message to the Interface page to display.</p></td>
        <td width="114"><p>Displays</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-6 Attributes</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Concept</p></td>
        <td width="120" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Manual Backup</p></td>
        <td width="120" valign="top"><p>Backup parameters</p></td>
        <td width="369" valign="top"><p>From date, To date</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><img src="img/UC-6  Manual Backup.bmp" width="635" height="421"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left" width="625">
      <tr>
        <td width="625" colspan="3" valign="top"><p align="center"><strong>Add Category</strong></p>
          <p align="center">UC-7 Responsibility</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Responsibility    Description</p></td>
        <td width="49" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept    name</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Coordinate actions of    concepts associated with this use case and delegate the work to other    concepts.</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>HTML document that    displays what actions can be done.</p></td>
        <td width="49" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface Page</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Creates a new    category to the database</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Category Creator</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Prepares a database    query for creating a new category</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database Connection</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Displays process    completion message to the user </p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Page Maker</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-7 Association</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Concept pair</p></td>
        <td width="288" valign="top"><p>Association description</p></td>
        <td width="114" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔  Interface Page</p></td>
        <td width="288" valign="top"><p>Controller    displays the interface page to the user </p></td>
        <td width="114" valign="top"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Interface    Page ↔ Controller</p></td>
        <td width="288" valign="top"><p>Interface    page passes new category name to the controller </p></td>
        <td width="114" valign="top"><p>Conveys    request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔ Category Creator</p></td>
        <td width="288" valign="top"><p>Controller    passes the category name to the category creator </p></td>
        <td width="114" valign="top"><p>Conveys    request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Category    Creator ↔ Database Connection</p></td>
        <td width="288" valign="top"><p>Category    creator requests category creation into the database</p></td>
        <td width="114" valign="top"><p>Queries    Creation</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Database    Connection ↔ Page Maker</p></td>
        <td width="288" valign="top"><p>Database    Connection creates the category into the database and notifies the page    maker.</p></td>
        <td width="114" valign="top"><p>Notifies</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Page    Maker ↔ Interface Page</p></td>
        <td width="288" valign="top"><p>Page    Maker creates a process completion message and passes it to the Interface    page</p></td>
        <td width="114" valign="top"><p>Passes    Message</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-7 Attributes</p></td>
      </tr>
      <tr>
        <td width="144" valign="top"><p>Concept</p></td>
        <td width="110" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="144"><p align="center">Category Creator</p></td>
        <td width="110" valign="top"><p>Category Name</p></td>
        <td width="369" valign="top"><p>A name that is to be given to the new category.</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><img src="img/UC-7 Add Category.bmp" width="632" height="425"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left" width="625">
      <tr>
        <td width="625" colspan="3" valign="top"><p align="center"><strong>Delete Category </strong></p>
          <p align="center">UC-8 Responsibility</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Responsibility    Description</p></td>
        <td width="49" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept    name</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Coordinate actions of    concepts associated with this use case and delegate the work to other concepts.</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>HTML document that    displays what actions can be done.</p></td>
        <td width="49" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface Page</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Remove an existing category    from the database</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Category Remover</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Prepares a database    query for removing  an existing category</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database Connection</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Displays process    completion message to the user </p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Page Maker</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-8 Association</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Concept pair</p></td>
        <td width="288" valign="top"><p>Association description</p></td>
        <td width="114" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔  Interface Page</p></td>
        <td width="288" valign="top"><p>Controller    displays the interface page to the user </p></td>
        <td width="114" valign="top"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Interface    Page ↔ Controller</p></td>
        <td width="288" valign="top"><p>Interface    page passes deleting category name to the controller </p></td>
        <td width="114" valign="top"><p>Conveys    request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔ Category Creator</p></td>
        <td width="288" valign="top"><p>Controller    passes the category name to the category remover </p></td>
        <td width="114" valign="top"><p>Conveys    request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Category    Creator ↔ Database Connection</p></td>
        <td width="288" valign="top"><p>Category    remover requests category deletion from the database</p></td>
        <td width="114" valign="top"><p>Queries    Creation</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Database    Connection ↔ Page Maker</p></td>
        <td width="288" valign="top"><p>Database    Connection removes the category from the database and notifies the page    maker.</p></td>
        <td width="114" valign="top"><p>Notifies</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Page    Maker ↔ Interface Page</p></td>
        <td width="288" valign="top"><p>Page    Maker creates a process completion message and passes it to the Interface    page</p></td>
        <td width="114" valign="top"><p>Passes    Message</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-8 Attributes</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Concept</p></td>
        <td width="120" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="134"><p align="center">Category Remover</p></td>
        <td width="120" valign="top"><p>Category Name</p></td>
        <td width="369" valign="top"><p>The category name that is to be removed </p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><img src="img/UC-8 Remove Category.bmp" width="634" height="455"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="601" colspan="3" valign="top"><p align="center"><strong>Record Edition</strong></p>
          <p align="center"> UC-9:     Responsibility</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Responsibility  Description</strong></p></td>
        <td width="44" valign="top"><p>Type</p></td>
        <td width="200" valign="top"><p>Concept Name</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Coordinate actions of    concepts associated with this use case and delegate the work to other    concepts.</strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Form specifying the    search parameters for the record of interest(date, name,tag,category) for    database log retrieval</strong></p></td>
        <td width="44" valign="top"><p>K</p></td>
        <td width="200" valign="top"><p>Search Request</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Render the retrieved    records into an HTML document for sending to actor&rsquo;s Web browser for display</strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Page Maker</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>HTML document that shows    the actor the current context, what actions can be done( Edit and delete record)</strong></p></td>
        <td width="44" valign="top"><p>K</p></td>
        <td width="200" valign="top"><p>Interface Page</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Prepare a database query    that best matches the actor&rsquo;s search criteria and retrieve the record(s) from    the database </strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Database Connection</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>List of &ldquo;interesting&rdquo;    records for further actions( Edit, Delete)</strong></p></td>
        <td width="44" valign="top"><p>K</p></td>
        <td width="200" valign="top"><p>Investigation Request</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Update the record of    interest in the database </strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Editor(Updator)</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Notify Administrator    about the update</strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Notifier</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0">
      <tr>
        <td width="200" valign="top"><p><strong> </strong></p></td>
        <td width="200" valign="top"><p><strong> </strong></p></td>
        <td width="200" valign="top"><p><strong> </strong></p></td>
      </tr>
      <tr>
        <td width="601" colspan="3" valign="top"><p align="center"><strong>   UC-9:Associations</strong></p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Concept pair</strong></p></td>
        <td width="200" valign="top"><p>Association Description</p></td>
        <td width="200" valign="top"><p>Association name</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Controller</strong><strong>↔Page Maker</strong></p></td>
        <td width="200" valign="top"><p>Controller passes requests to Page    Maker and receives back pages prepared for displaying</p></td>
        <td width="200" valign="top"><p> </p>
          <p>conveys requests</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Page Maker </strong><strong>↔Database    Connection</strong></p></td>
        <td width="200" valign="top"><p>Database Connection passes the retrieved data to Page    Maker to render them for display</p></td>
        <td width="200" valign="top"><p>provides data</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Page Maker   </strong><strong>↔Interface Page</strong></p></td>
        <td width="200" valign="top"><p>Page Maker prepares the Interface    Page</p></td>
        <td width="200" valign="top"><p>prepares</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Controller </strong><strong>↔Database    Connection</strong></p></td>
        <td width="200" valign="top"><p>Controller passes search requests for the record of    interest to Database Connection</p></td>
        <td width="200" valign="top"><p>conveys requests</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Controller </strong><strong>↔</strong><strong>Investigation Request</strong></p></td>
        <td width="200" valign="top"><p> generates list of matching records</p></td>
        <td width="200" valign="top"><p>generates</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Controller </strong><strong>↔Editor(Updater)</strong></p></td>
        <td width="200" valign="top"><p>Controller passes the record of interest to    Editor(Updater), which updates the record</p></td>
        <td width="200" valign="top"><p>conveys requests</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="601" colspan="3" valign="top"><p align="center"><strong> UC-9: Attributes</strong></p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Concept</strong></p></td>
        <td width="200" valign="top"><p>Attributes</p></td>
        <td width="200" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Search    Request</strong></p></td>
        <td width="200" valign="top"><p>search <br>
          parameters</p></td>
        <td width="200" valign="top"><p>Need to    Filter the retrieved records to match the actor&rsquo;s search criteria.</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Investigation </strong><br>
          <strong>Request</strong></p></td>
        <td width="200" valign="top"><p>records    list</p></td>
        <td width="200" valign="top"><p>List of    &ldquo;Matching&rdquo; records generated</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Editor</strong></p></td>
        <td width="200" valign="top"><p>IsUpdate</p></td>
        <td width="200" valign="top"><p>Needed to    check the if the record was updated</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Notifier</strong></p></td>
        <td width="200" valign="top"><p>RecordName</p></td>
        <td width="200" valign="top"><p>Needed to    notify that  the record was updated</p></td>
      </tr>
    </table></td>
  </tr>
  
   <tr>
    <td> </td>
  </tr>
   <tr>
    <td><img src="img/Usecase-9.bmp" width="643" height="502"></td>
  </tr>
   <tr>
    <td> </td>
  </tr>
   <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="601" colspan="3" valign="top"><p align="center"><strong> Record Deletion</strong></p>
          <p align="center"> UC-10: Responsibility</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Responsibility  Description</strong></p></td>
        <td width="44" valign="top"><p>Type</p></td>
        <td width="200" valign="top"><p>Concept Name</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Coordinate actions of    concepts associated with this use case and delegate the work to other    concepts.</strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Form specifying the    search parameters for the record of interest(date, name,tag,category) for    database log retrieval</strong></p></td>
        <td width="44" valign="top"><p>K</p></td>
        <td width="200" valign="top"><p>Search Request</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Render the retrieved    records into an HTML document for sending to actor&rsquo;s Web browser for display</strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Page Maker</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>HTML document that shows    the actor the current context, what actions can be done( Edit and delete record)</strong></p></td>
        <td width="44" valign="top"><p>K</p></td>
        <td width="200" valign="top"><p>Interface Page</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Prepare a database query    that best matches the actor&rsquo;s search criteria and retrieve the record(s) from    the database </strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Database Connection</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>List of &ldquo;interesting&rdquo;    records for further actions( Edit, Delete)</strong></p></td>
        <td width="44" valign="top"><p>K</p></td>
        <td width="200" valign="top"><p>Investigation Request</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Delete the record of    interest from the database </strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Deletor (Updater)</p></td>
      </tr>
      <tr>
        <td width="357" valign="top"><p><strong>Notify Administrator about    the delete</strong></p></td>
        <td width="44" valign="top"><p>D</p></td>
        <td width="200" valign="top"><p>Notifier</p></td>
      </tr>
    </table></td>
  </tr>
   <tr>
    <td> </td>
  </tr>
   <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="601" colspan="3" valign="top"><p align="center"><strong>  UC-10: Attributes</strong></p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Concept</strong></p></td>
        <td width="200" valign="top"><p>Attributes</p></td>
        <td width="200" valign="top"><p>Attribute    Description</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Search    Request</strong></p></td>
        <td width="200" valign="top"><p>SearchParameters</p></td>
        <td width="200" valign="top"><p>Need to    Filter the retrieved records to match the actor&rsquo;s search criteria.</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Investigation </strong><br>
          <strong>Request</strong></p></td>
        <td width="200" valign="top"><p>records    list</p></td>
        <td width="200" valign="top"><p>List of    &ldquo;Matching&rdquo; records generated</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Deletor(record    remover)</strong></p></td>
        <td width="200" valign="top"><p>IsRemoved</p></td>
        <td width="200" valign="top"><p>Needed to    check that if the record was removed</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Notifier</strong></p></td>
        <td width="200" valign="top"><p>RecordName</p></td>
        <td width="200" valign="top"><p>Needed to    notify that  the record was removed</p></td>
      </tr>
    </table></td>
  </tr>
   <tr>
    <td> </td>
  </tr>
   <tr>
    <td><table border="1" cellspacing="0" cellpadding="0">
      <tr>
        <td width="200" valign="top"><p><strong> </strong></p></td>
        <td width="200" valign="top"><p><strong> </strong></p></td>
        <td width="200" valign="top"><p><strong> </strong></p></td>
      </tr>
      <tr>
        <td width="601" colspan="3" valign="top"><p align="center"><strong>  UC-10: associations</strong></p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Concept pair</strong></p></td>
        <td width="200" valign="top"><p>Association Description</p></td>
        <td width="200" valign="top"><p>Association name</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Controller</strong><strong>↔ </strong><br>
          <strong>Page Maker</strong></p></td>
        <td width="200" valign="top"><p>Controller passes requests to Page    Maker and receives back pages prepared for displaying</p></td>
        <td width="200" valign="top"><p> </p>
          <p>conveys requests</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>age Maker </strong><strong>↔ </strong><br>
          <strong>Database Connection</strong></p></td>
        <td width="200" valign="top"><p>Database Connection passes the retrieved data to Page    Maker to render them for display</p></td>
        <td width="200" valign="top"><p>provides data</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Page Maker   </strong><strong>↔ </strong><br>
          <strong>Interface Page</strong></p></td>
        <td width="200" valign="top"><p>Page Maker prepares the Interface    Page</p></td>
        <td width="200" valign="top"><p>prepares</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Controller </strong><strong>↔ </strong><br>
          <strong>Database Connection</strong></p></td>
        <td width="200" valign="top"><p>Controller passes search requests for the record of    interest to Database Connection</p></td>
        <td width="200" valign="top"><p>conveys requests</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Controller </strong><strong>↔</strong><strong> </strong><br>
          <strong>Investigation Request</strong></p></td>
        <td width="200" valign="top"><p> generates list of matching records</p></td>
        <td width="200" valign="top"><p>generates</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Controller </strong><strong>↔ </strong><br>
          <strong>Deletor(Record remover)</strong></p></td>
        <td width="200" valign="top"><p>Controller passes the record of interest to Deletor,    which removes it the record</p></td>
        <td width="200" valign="top"><p>conveys requests</p></td>
      </tr>
    </table></td>
  </tr>
   <tr>
    <td> </td>
  </tr>
   </tr>
  <tr>
     <td>&nbsp;</td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="601" colspan="3" valign="top"><p align="center"><strong> UC-10: Attributes</strong></p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Concept</strong></p></td>
        <td width="200" valign="top"><p>Attributes</p></td>
        <td width="200" valign="top"><p>Attribute    Description</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Search    Request</strong></p></td>
        <td width="200" valign="top"><p>SearchParameters</p></td>
        <td width="200" valign="top"><p>Need to    Filter the retrieved records to match the actor&rsquo;s search criteria.</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Investigation </strong><br>
          <strong>Request</strong></p></td>
        <td width="200" valign="top"><p>records    list</p></td>
        <td width="200" valign="top"><p>List of &ldquo;Matching&rdquo;    records generated</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Deletor(record    remover)</strong></p></td>
        <td width="200" valign="top"><p>IsRemoved</p></td>
        <td width="200" valign="top"><p>Needed to    check that if the record was removed</p></td>
      </tr>
      <tr>
        <td width="200" valign="top"><p><strong>Notifier</strong></p></td>
        <td width="200" valign="top"><p>RecordName</p></td>
        <td width="200" valign="top"><p>Needed to    notify that  the record was removed</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><img src="img/Usecase-10.bmp" width="656" height="532"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left" width="625">
      <tr>
        <td width="625" colspan="3" valign="top"><p align="center"><strong>Add User </strong></p>
          <p align="center">UC-11 Responsibility</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Responsibility    Description</p></td>
        <td width="49" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept    name</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Coordinate actions of    concepts associated with this use case and delegate the work to other    concepts.</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>HTML document that    displays what actions can be done.</p></td>
        <td width="49" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface Page</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Creates a new user into    the database</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>User Creator</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Prepares a database    query for creating a new user</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database Connection</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Displays the result message    to the user </p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Page Maker</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-11 Association</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Concept pair</p></td>
        <td width="288" valign="top"><p>Association description</p></td>
        <td width="114" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔  Interface Page</p></td>
        <td width="288" valign="top"><p>Controller    displays the interface page to the user </p></td>
        <td width="114" valign="top"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Interface    Page ↔ Controller</p></td>
        <td width="288" valign="top"><p>Interface    page passes new user&rsquo;s name to the controller </p></td>
        <td width="114" valign="top"><p>Conveys    request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔ User Creator</p></td>
        <td width="288" valign="top"><p>Controller    passes the user&rsquo;s name to the user creator </p></td>
        <td width="114" valign="top"><p>Conveys    request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>User    Creator ↔ Database Connection</p></td>
        <td width="288" valign="top"><p>User    creator requests User creation into the database</p></td>
        <td width="114" valign="top"><p>Queries    Creation</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Database    Connection ↔ Page Maker</p></td>
        <td width="288" valign="top"><p>Database    Connection creates the category into the database and notifies the page    maker.</p></td>
        <td width="114" valign="top"><p>Notifies</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Page    Maker ↔ Interface Page</p></td>
        <td width="288" valign="top"><p>Page    Maker creates the result message and displays to the Interface page</p></td>
        <td width="114" valign="top"><p>Passes    Message</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-11 Attributes</p></td>
      </tr>
      <tr>
        <td width="144" valign="top"><p>Concept</p></td>
        <td width="110" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="144"><p align="center">User Creator</p></td>
        <td width="110" valign="top"><p>User parameters </p></td>
        <td width="369" valign="top"><p>User name , password , re-password , job title</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><img src="img/UC-11 Add user.bmp" width="649" height="442"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left" width="625">
      <tr>
        <td width="625" colspan="3" valign="top"><p align="center"><strong>Remove User</strong></p>
          <p align="center">UC-12 Responsibility</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Responsibility    Description</p></td>
        <td width="49" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept    name</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Coordinate actions of    concepts associated with this use case and delegate the work to other    concepts.</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>HTML document that    displays what actions can be done.</p></td>
        <td width="49" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface Page</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Remove an existing user    from the database</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>User Remover</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Prepares a database    query for removing an existing user</p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Database Connection</p></td>
      </tr>
      <tr>
        <td width="432" valign="top"><p>Displays the result    message to the user </p></td>
        <td width="49" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Page Maker</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  
   <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-12 Association</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Concept pair</p></td>
        <td width="288" valign="top"><p>Association description</p></td>
        <td width="114" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔  Interface Page</p></td>
        <td width="288" valign="top"><p>Controller    displays the interface page to the user </p></td>
        <td width="114" valign="top"><p>Displays</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Interface    Page ↔ Controller</p></td>
        <td width="288" valign="top"><p>Interface    page passes an existing  user&rsquo;s name to    the controller </p></td>
        <td width="114" valign="top"><p>Conveys    request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔ User Remover</p></td>
        <td width="288" valign="top"><p>Controller    passes the user&rsquo;s name to the user remover </p></td>
        <td width="114" valign="top"><p>Conveys    request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>User    remover ↔ Database Connection</p></td>
        <td width="288" valign="top"><p>User    remover requests User deletion from the database</p></td>
        <td width="114" valign="top"><p>Queries    deletion</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Database    Connection ↔ Page Maker</p></td>
        <td width="288" valign="top"><p>Database    Connection removes the user from the database and notifies the page maker.</p></td>
        <td width="114" valign="top"><p>Notifies</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Page    Maker ↔ Interface Page</p></td>
        <td width="288" valign="top"><p>Page    Maker creates the result message and displays to the Interface page</p></td>
        <td width="114" valign="top"><p>Passes    Message</p></td>
      </tr>
    </table></td>
  </tr>
   <tr>
    <td> </td>
  </tr>
   <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-12 Attributes</p></td>
      </tr>
      <tr>
        <td width="144" valign="top"><p>Concept</p></td>
        <td width="110" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="144"><p align="center">User Remover</p></td>
        <td width="110"><p align="center">User name</p></td>
        <td width="369"><p>Name of the user that is to be deleted</p></td>
      </tr>
    </table></td>
  </tr>
   <tr>
    <td> </td>
  </tr>
   <tr>
    <td><img src="img/UC-12 remove.bmp" width="646" height="481"></td>
  </tr>
   <tr>
    <td> </td>
  </tr>
   <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center"><strong>Authenticate User</strong></p>
          <p align="center">UC-13 Responsibility</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Responsibility    Description</p></td>
        <td width="48" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept    name</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Coordinate actions of    concepts associated with this use case and delegate the work to other    concepts.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Container for user&rsquo;s    authentication data, such as user name and password</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Key</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Verify whether or not    the authentication key entered by the user is valid.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Key Checker</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Container for the    collection of valid keys associated with users.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Key Storage</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>HTML document that    displays what actions can be done.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface Page</p></td>
      </tr>
    </table></td>
  </tr>
   <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-13 Association</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Concept pair</p></td>
        <td width="288" valign="top"><p>Association description</p></td>
        <td width="114" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Key    ↔ Controller</p></td>
        <td width="288" valign="top"><p>Key    passes the username and password to the controller</p></td>
        <td width="114" valign="top"><p>Obtains    Key</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔ key Checker</p></td>
        <td width="288" valign="top"><p>Controller    passes the key to the key checker and key checker returns the result</p></td>
        <td width="114" valign="top"><p>Conveys    Key</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Key    ↔ Key Checker</p></td>
        <td width="288" valign="top"><p>Key    checker verifies the obtained key</p></td>
        <td width="114" valign="top"><p>Verifies</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Key    checker ↔ Key Storage</p></td>
        <td width="288" valign="top"><p>Key    Checker checks the key storage whether the key matches or not.</p></td>
        <td width="114" valign="top"><p>Validates    Key</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔ Interface Page</p></td>
        <td width="288" valign="top"><p>Controller    displays the Interface Page</p></td>
        <td width="114" valign="top"><p>Displays</p></td>
      </tr>
    </table></td>
  </tr>
  
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-13 Attributes</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Concept</p></td>
        <td width="120" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="134"><p align="center">Key</p></td>
        <td width="120" valign="top"><p>Authentication<br>
          parameters</p></td>
        <td width="369" valign="top"><p>Used to identify the user accessibility rights</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Key Checker</p></td>
        <td width="120" valign="top"><p>Key</p></td>
        <td width="369" valign="top"><p>Used to verify the authentication parameters </p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Key Storage</p></td>
        <td width="120" valign="top"><p>Valid Keys</p></td>
        <td width="369" valign="top"><p>Storage for valid keys</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><img src="img/UC-13 Authentication.bmp" width="671" height="495"></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center"><strong>Set Backup Properties</strong></p>
          <p align="center">UC-14 Responsibility</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Responsibility Description</p></td>
        <td width="48" valign="top"><p>Type</p></td>
        <td width="144" valign="top"><p>Concept name</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Coordinate    actions of concepts associated with this use case and delegate the work to    other concepts.</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Controller</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>HTML    document that displays what actions can be done.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Interface    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Form    specifying the parameters to set up Auto-Backup properties.</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Backup    Page</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>To    perform the filter request according to the user specified criteria</p></td>
        <td width="48" valign="top"><p>D</p></td>
        <td width="144" valign="top"><p>Scheduler</p></td>
      </tr>
      <tr>
        <td width="431" valign="top"><p>Notifies    user about the changes made to the properties</p></td>
        <td width="48" valign="top"><p>K</p></td>
        <td width="144" valign="top"><p>Notifier</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-14 Association</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Concept pair</p></td>
        <td width="276" valign="top"><p>Association description</p></td>
        <td width="126" valign="top"><p>Association name </p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Backup    Page ↔ Controller</p></td>
        <td width="276" valign="top"><p>Backup    Page passes the setting parameters to the Controller </p></td>
        <td width="126" valign="top"><p>Conveys    Request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Controller    ↔ Scheduler</p></td>
        <td width="276" valign="top"><p>Controller    passes the setting parameters to the Scheduler.</p></td>
        <td width="126" valign="top"><p>Conveys    Request</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Scheduler    ↔ Notifier</p></td>
        <td width="276" valign="top"><p>Scheduler    sets new values for backup schedule and Informs the Notifier</p></td>
        <td width="126" valign="top"><p>Informs</p></td>
      </tr>
      <tr>
        <td width="222" valign="top"><p>Notifier    ↔ Interface Page</p></td>
        <td width="276" valign="top"><p>Notifier    notifies the Interface Page about the changes, to display the result.</p></td>
        <td width="126" valign="top"><p>Notifies</p></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td> </td>
  </tr>
  <tr>
    <td><table border="1" cellspacing="0" cellpadding="0" align="left">
      <tr>
        <td width="623" colspan="3" valign="top"><p align="center">UC-14 Attributes</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Concept</p></td>
        <td width="120" valign="top"><p>Attributes</p></td>
        <td width="369" valign="top"><p>Attribute Description</p></td>
      </tr>
      <tr>
        <td width="134" valign="top"><p>Scheduler</p></td>
        <td width="120" valign="top"><p>Schedule parameters</p></td>
        <td width="369" valign="top"><p>Daily, Weekly, numberOfDays</p></td>
      </tr>
    </table></td>
  </tr>
  
  <tr>
    <td><img src="img/UC-14 backup properties.bmp" width="684" height="473"></td>
  </tr>
</table>
