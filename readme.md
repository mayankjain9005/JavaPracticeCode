**RegressAssignment / RegressRelease actions (Ignore 'events' properties if no webhook callback):**  
Required:

|     |     |
| --- | --- |
| runtimeConfiguration | see ISPW administrator for valid values |
| assignmentId (RegressAsignment) or releaseId (RegressRelease) | The container for which you intend to regress the tasks |
| level | All tasks in the container at this level will be generated |

Optional:

|     |     |
| --- | --- |
| mname | component with this name in the container will be regressed |
| mtype | component with this type in the container will be regressed |
| changeType | S for standard, I for incidental, or E for emergency. Default value of S |
| executionStatus | I for immediate execution or at start date/time, H to create request in hold |

Example:

|     |     |
| --- | --- |
| RegressAssignment | RegressRelease |
| runtimeConfiguration=TPZP  <br>assignmentId=PLAY000313  <br>level=STG2  <br>#optional  <br>mname=TPROG08  <br>mtype=COB  <br>#optional, if use webhook callback in pipeline  <br>events.name=Completed  <br>events.body=Regressed  <br>events.httpHeaders=Jenkins-Crumb:no-crumb  <br>events.credentials=admin:library | runtimeConfiguration=TPZP  <br>releaseId=JKGENRELID  <br>level=STG2  <br>#optional  <br>mname=TPROG08  <br>mtype=COB  <br>#optional, if use webhook callback in pipeline  <br>events.name=Completed  <br>events.body=Regressed  <br>events.httpHeaders=Jenkins-Crumb:no-crumb  <br>events.credentials=admin:library |
