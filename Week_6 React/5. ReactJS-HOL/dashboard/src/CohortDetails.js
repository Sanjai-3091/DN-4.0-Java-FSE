import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ cohort }) => {
  return (
    <div className={styles.box}>
      <h3 style={{ color: cohort.currentStatus.toLowerCase() === 'ongoing' ? 'green' : 'blue' }}>
        {cohort.cohortCode}
      </h3>
      <dl>
        <dt>Technology:</dt>
        <dd>{cohort.technology}</dd>

        <dt>Start Date:</dt>
        <dd>{cohort.startDate}</dd>

        <dt>Trainer Name:</dt>
        <dd>{cohort.trainerName}</dd>

        <dt>Coach Name:</dt>
        <dd>{cohort.coachName}</dd>

        <dt>Status:</dt>
        <dd>{cohort.currentStatus}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;