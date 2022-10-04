package com.zendesk.maxwell.producer.partitioners;

import com.zendesk.maxwell.producer.partitioners.AbstractMaxwellPartitioner;
import com.zendesk.maxwell.row.RowMap;
import org.apache.commons.codec.digest.DigestUtils;

public class MaxwellPubsubPartitioner extends AbstractMaxwellPartitioner  {
	public MaxwellPubsubPartitioner(String partitionKey, String csvPartitionColumns,
			String partitionKeyFallback) {
		super(partitionKey, csvPartitionColumns, partitionKeyFallback);
	}
}
