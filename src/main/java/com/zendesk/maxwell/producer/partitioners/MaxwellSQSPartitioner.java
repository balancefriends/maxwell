package com.zendesk.maxwell.producer.partitioners;

public class MaxwellSQSPartitioner extends AbstractMaxwellPartitioner  {
	public MaxwellSQSPartitioner(String partitionKey, String csvPartitionColumns,
			String partitionKeyFallback) {
		super(partitionKey, csvPartitionColumns, partitionKeyFallback);
	}
}
